import java.util.ArrayList;

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

    // print elements of ArrayList
    System.out.println(strList);
  }
}
