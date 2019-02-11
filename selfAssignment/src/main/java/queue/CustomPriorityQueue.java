package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by pankaj on 01,2019
 */
public class CustomPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(100);
        priorityQueue.add(200);
        priorityQueue.add(10);
        priorityQueue.add(50);
        priorityQueue.add(5);
        priorityQueue.add(7);
        System.out.println(priorityQueue.peek());
    }
}

