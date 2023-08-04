
package lab.pkg4;

import java.util.Scanner;


public class Task_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = input.nextInt();
    int[] err = new int[n];
    int t1=0,t2=1;
    System.out.print("First 8 Fibonacci numbers: ");
    err[0]=0;
    err[1]=1;
    for(int i=2 ; i<8 ; i++){
      
      err[i]=err[i-1]+err[i-2];
    }
    for(int value:err){
      System.out.print(value +" ");
    }
  }
  
}
