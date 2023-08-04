
package lab.pkg4;

import java.util.Scanner;


public class Task_4 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size : ");
    int n = input.nextInt();
    int[] arr = new int[n];
    int count;
    System.err.println("Enter numbers : ");
    for(int i=0 ; i<n ;i++){
      arr[i]=input.nextInt();
    }
    System.out.print("Output : ");
    for(int i=2 ; i<n ;i++){
      if(arr[i]==arr[i-1]){
        if(arr[i]==arr[i-2]){
          count=arr[i];
          System.out.print(arr[i] + " ");
        }
      }  
    }
    
  }
  
}
