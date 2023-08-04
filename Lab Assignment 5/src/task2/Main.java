
package task2;

import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int array[]=new int[100];
    for(int i=0;i<array.length;i++)
    {
      array[i]=(int)(Math.random()*100);
    }
    System.out.print("Enter an Index :");
    try{
      int index=input.nextInt();
      System.out.println("The value of array is [ " + index + " ] is = " + array[index]);
    }
    catch (ArrayIndexOutOfBoundsException ex){
      System.out.print("Out of Range");
      System.exit(0);
    }
    catch (Exception ex) {
      System.out.println("Error!Try diffrent index.");
      System.exit(1);
    }  }
  
}
