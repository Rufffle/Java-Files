
package lab_5;

import java.util.Scanner;


public class Task_2 {
  
  public static boolean isPalindrome(String yourString) {
    String rev="";
    for(int i=yourString.length()-1 ; i>=0 ; i--){
      rev = rev+yourString.charAt(i);
    }
    
    int n = yourString.compareTo(rev);
    //System.out.println(n);
    if(n!=0){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    boolean n = isPalindrome(str);
    if(n==true){
      System.out.println(str + " is not palindrome");
    }
    else{
      System.out.println(str + " is palindrome");
    }
    
  }
  
}
