package impl;

/**
 * Created by pankaj on 07,2019
 */
public class CustomMainClass {

  public static void main(String[] args) {
    CustomHashMap<String,String> map=new CustomHashMap<>();
    map.put("1","Pankaj");
    map.put("1","Sharma");
    map.put(null,"Abhinav");
    System.out.println(map.get(null));
  }
}
