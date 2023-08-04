
package lab_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab_15 {

  public static void main(String[] args) {
    
    Map<String,Integer> wordCount = new HashMap<String,Integer>();
    Scanner input = new Scanner(System.in);
    int val;
    for(int i=0 ; i<5 ; i++){
      String word = input.nextLine();
      if(!wordCount.containsKey(word)){
        val=1;
        wordCount.put(word, val);
      }
      else{
        val=wordCount.get(word);
        val++;
        wordCount.put(word, val);
      }
    }
    
      System.out.print(wordCount);
    
  }
  
}
