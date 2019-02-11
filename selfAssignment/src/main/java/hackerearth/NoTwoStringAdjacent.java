package hackerearth;

import queue.CharacterFequency;

import java.util.*;

/**
 * Created by pankaj on 01,2019
 */
public class NoTwoStringAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input[] = sc.nextLine().toCharArray();
        PriorityQueue<CharacterFequency> priorityQueue = new PriorityQueue(new CharacterFrequencyComparator());
        int countFreq[]=new int[27];
        Arrays.fill(countFreq,0);
        for(int i=0;i<input.length;i++){
            int index=input[i]-'a';
            countFreq[index]++;
        }

        for(int i=0;i<27;i++){
            if(countFreq[i]>0){
                priorityQueue.add(new CharacterFequency(
                        (char) ('a'+i),countFreq[i]));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        CharacterFequency prev = new CharacterFequency('#',-1);
        while (!priorityQueue.isEmpty()){
            CharacterFequency pq = priorityQueue.peek();
            priorityQueue.poll();
            if(prev.getFrequency()>0){
                priorityQueue.add(prev);
            }
            stringBuilder.append(pq.getCharacter());
            pq.setFrequency(pq.getFrequency()-1);
            prev=pq;
        }
        if(stringBuilder.length()!=countFreq.length){
            System.out.println("Not a Valid String");
        }else
            System.out.println(stringBuilder.toString());
    }
}

class CharacterFrequencyComparator implements Comparator<CharacterFequency> {

    @Override
    public int compare(CharacterFequency o1, CharacterFequency o2) {
        if(o1.getFrequency() < o2.getFrequency()){
            return 1;
        }else if(o1.getFrequency() > o2.getFrequency()){
            return -1;
        }else{
            return 0;
        }

    }
}
