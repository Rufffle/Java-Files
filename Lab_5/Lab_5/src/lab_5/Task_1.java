
package lab_5;

import java.util.Scanner;

public class Task_1 {
  
  public static int countVowels(String yourString){
  
  int num_vowel = 0;
  
  for(int i = 0 ; i <yourString.length() ; i++){
    
    if(yourString.charAt(i)=='a'||yourString.charAt(i)=='e'||yourString.charAt(i)=='i'||yourString.charAt(i)=='o'||yourString.charAt(i)=='u')
      num_vowel++;
    }
  
  return num_vowel;

 }
   
  
  public static void main(String[] args) {
  
    String str;
    Scanner input = new Scanner(System.in);
    str = input.nextLine();
    
    int vowel = countVowels(str);
    
    System.out.println(vowel);
    
  }
  
}