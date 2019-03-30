package hackerearth;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringJoiner;
import java.util.TreeSet;

/**
 * Created by pankaj on 03,2019
 */
public class SetQuestion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    while (testCase-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      Set<Integer> firstSet = new LinkedHashSet();
      for (int i = 0; i < n; i++) {
        firstSet.add(sc.nextInt());
      }
      Set<Integer> secondSet = new LinkedHashSet();
      for (int i = 0; i < m; i++) {
        secondSet.add(sc.nextInt());
      }
      int x = sc.nextInt();
      Set<Integer> result=null;
      switch (x) {
        case 1: result=setIntersection(firstSet,secondSet);
          break;
        case 2: result=setUnionOperation(firstSet,secondSet);
          break;
        case 3: result= setDifferenceSet(setUnionOperation(firstSet,secondSet),setIntersection(firstSet,secondSet));
          break;
        case 4: result=setDifferenceSet(firstSet,secondSet);
          break;
        case 5: result=setDifferenceSet(secondSet,firstSet);
          break;
      }

      Iterator<Integer> iterator = result.iterator();
      StringJoiner stringJoiner = new StringJoiner(", ");
      while (iterator.hasNext()){
        stringJoiner.add(iterator.next().toString());
      }
      System.out.println("{"+stringJoiner.toString()+"}");
    }
  }

  private static Set<Integer> setUnionOperation(Set<Integer> a, Set<Integer> b) {
    SortedSet<Integer> result = new TreeSet<>();
    Iterator<Integer> iterator = a.iterator();
    while (iterator.hasNext()) {
      result.add(iterator.next());
    }
    iterator = b.iterator();
    while (iterator.hasNext()) {
      result.add(iterator.next());
    }
    return result;
  }

  private static Set<Integer> setIntersection(Set<Integer> a, Set<Integer> b) {
    SortedSet<Integer> result = new TreeSet<>();
    Iterator<Integer> iterator = a.iterator();
    while (iterator.hasNext()) {
      Integer value = iterator.next();
      if (b.contains(value)) {
        result.add(value);
      }
    }
    return result;
  }

  private static Set<Integer> setDifferenceSet(Set<Integer> a, Set<Integer> b) {
    SortedSet<Integer> result = new TreeSet<>();
    Iterator<Integer> iterator = a.iterator();
    while (iterator.hasNext()) {
      Integer value = iterator.next();
      if (b.contains(value)) {
        continue;
      }
      result.add(value);
    }
    return result;
  }
}
