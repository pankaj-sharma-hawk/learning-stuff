package rahul;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pankaj on 07,2019
 */
public class ConstructListFromArray {

  public static void main(String[] args) {
    //int arr[]=new int[1,4,-1,3,2];
    int arr[] = new int[]{1, 4, -1, 3, 2};
    HashMap<Character,Integer> map=new HashMap<>();
    map.put('a',23);
    map.put('a',30);
    System.out.println(map.get('a'));
    int value=5;
    System.out.println(value>>>16);
    //System.out.println(solution(arr));
    //System.out.println(solution("ONLABLABLOON"));
  }

  public static int solution(int arr[]) {
    int head = 0;
    int count = 0;
    while (arr[head] != -1) {
      head = arr[head];
      count++;
    }
    return count + 1;
  }

  public static int solution(String string) {
    // BALLON
    char ch[] = string.toCharArray();
    int countArray[] = new int[26];

    int index = 0;
    List<Character> list = Arrays.asList('B', 'A', 'L', 'O', 'N');
    for (int i = 0; i < ch.length; i++) {
      index = (ch[i] - 'A');
      if (list.contains(ch[i])) {
        countArray[index]++;
      }
    }
    countArray[('L') - 'A'] = countArray[('L') - 'A'] / 2;
    countArray[('O') - 'A'] = countArray[('O') - 'A'] / 2;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < 26; i++) {
      if (list.contains((char) ('A' + i)) && min > countArray[i]) {
        min = countArray[i];
      }
    }
    return min;
  }


}
