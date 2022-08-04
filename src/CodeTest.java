import java.util.ArrayList;
import java.util.Iterator;

public class CodeTest {
  public static void main(String[] args){

    // 1st step - Creating an ArrayLists of Strings
    ArrayList<String> strList = new ArrayList<String>();

    // 2nd step - Adding elements to ArrayList;
    strList.add("master coding app");
    strList.add("master coding channel");
    strList.add("master coding pro app");

    // 3rd step - adding elements in specified position
    strList.add(2,"Hello");
    strList.add(2,"2");
    strList.add(2,"world");

    // print elements of ArrayList
    System.out.println(strList);

    // 4th step - change an element in ArrayList
    strList.set(0,"changed 99");
    System.out.println(strList);

    // 5th step - remove element from ArrayList
    strList.remove(1);
    System.out.println(strList);
    strList.remove("changed 99");
    System.out.println(strList);

    // 6th step - Iterating trough array
    // using for loop
    for (int i = 0 ; i < strList.size(); i++){
      System.out.println(strList.get(i));
    }

    // using forEachLoop
    for (String s : strList) System.out.println(s);

    // using Iterator Interface
    Iterator<String> iterator = strList.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

    // Storing primitive data with Wrapper Class

    ArrayList<Integer> intList = new ArrayList<Integer>();

    int m = 14;
    Integer y = 15; // wrapper class
    Integer z = y.intValue();

    intList.add(y);
    intList.add(z);
    intList.add(m); // boxing automatically converts int to Interger object

    int x = intList.get(0); // Unboxing is a conversion from wrapped object to its primitive data


    System.out.println(intList);
    System.out.println(x);
  }
}
