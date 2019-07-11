package rahul;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

  public static void main(String[] args) {
    Set<MishraClass> set1 = new HashSet<>();
    Set<MishraClass> set2 = new HashSet<>();
    set1.add(new MishraClass(1, 12, "Pankaj"));
    set1.add(new MishraClass(2, 15, "Jam"));
    set1.add(new MishraClass(3, 16, "Sam"));
    set1.add(new MishraClass(4, 17, "Suman"));

    set2.add(new MishraClass(1, 12, "Mishra"));
    set2.add(new MishraClass(3, 16, "Rahul"));
    set2.add(new MishraClass(5, 17, "Krish"));
    set2.add(new MishraClass(7, 19, "Mis"));
    set2.add(new MishraClass(8, 32, "hra"));
    set2.add(new MishraClass(9, 82, "Raw"));
    Set<MishraClass> uniqueValue = getUniqueSet(set1, set2);
    System.out.println(uniqueValue);
  }

  private static Set<MishraClass> getUniqueSet(Set<MishraClass> set1, Set<MishraClass> set2) {
    Set<MishraClass> uniqueSet = new HashSet<>();
    Iterator<MishraClass> it = set1.iterator();
    while (it.hasNext()) {
      MishraClass value = it.next();
      if (!set2.contains(value)) {
        uniqueSet.add(value);
      }
    }
    Set<MishraClass> uniqueSet1 = new HashSet<>();
    it = set2.iterator();
    while (it.hasNext()) {
      MishraClass value = it.next();
      if (!set1.contains(value)) {
        uniqueSet1.add(value);
      }
    }
    uniqueSet.addAll(uniqueSet1);
    return uniqueSet;
  }
}
