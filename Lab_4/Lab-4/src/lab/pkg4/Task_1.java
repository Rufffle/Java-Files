
package lab.pkg4;

import java.util.Scanner;


public class Task_1 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i,sum=0,count=0;
    float avg,per;
    int[] arr = new int[6];
    for(i=0 ; i<6 ; i++){
      arr[i] = input.nextInt();
    }
    for(int value:arr){
      sum+=value;
    }
    avg = sum/6;
    System.out.println("Average of the array : "+avg);
    for(int value:arr){
      if(value>avg){
        count++;
      }
    }
    per = (count*100)/6;
    
    System.out.println("Percentage is "+per+"%");
  }
  
}
