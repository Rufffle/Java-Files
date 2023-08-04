package task2;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {

  public static void main(String[] args) {

    ArrayList<String> str = new ArrayList<String>();

    // Creating a HashMap containing char 
    // as a key and occurrences as  a value 
    HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your numbers (Input will end when the input is 0) :");
    do{
      String s = input.next();
      System.out.println("\t\t\t"+s);
      str.add(s);
      System.out.println(s +"\t"+str);
      if(input.next().equals("0")){
        break;
      }
    }while(input.hasNextLine());

    /* for (int index = 0; index < 10; index++) {
        if (str.get(index).equalsIgnoreCase("0")) {
          break;
        }
      }*/
    //char[] strArray = str.toCharArray();
    // checking each char of strArray 
    for (String c : str) {
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
      } else {
        charCountMap.put(c, 1);
      }
    }

   // System.out.println(str.get(1));
    // Printing the charCountMa
    for (Map.Entry entry : charCountMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

}
