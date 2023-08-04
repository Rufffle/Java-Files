
package lab.pkg4;

import java.util.Scanner;


public class Task_3 {
  
  public static void main(String[] args) {
    int[][] arr = new int[3][3];
    int s1,s2,s3,s4,s5,s6,d1,d2;
    s1=s2=s3=s4=s5=s6=d1=d2=0;
    Scanner input = new Scanner(System.in);
    for(int i=0 ; i<3 ; i++){
      for(int j=0; j<3 ; j++){
        arr[i][j]=input.nextInt();
      }
    }
    System.out.println("");
    for(int i=0 ; i<3 ; i++){
      for(int j=0; j<3 ; j++){
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println("");
    }
    for(int i=0 ; i<3 ; i++){
      for(int j=0; j<3 ; j++){
        if(i==0){
          s1+=arr[i][j];
        }
        if(i==1){
          s2+=arr[i][j];
        }
        if(i==2){
          s3+=arr[i][j];
        }
        if(j==0){
          s4+=arr[i][j];
        }
        if(j==1){
          s5+=arr[i][j];
        }
        if(j==2){
          s6+=arr[i][j];
        }
        if(i==j){
          d1+=arr[i][j];
        }
        if((i==2&&j==0)||(i==1&&j==1)||(i==0&&j==2)){
          d2+=arr[i][j];
        } 
      }
    }
    System.out.println("Sum of 1st row : "+s1);
    System.out.println("Sum of 2nd row : "+s2);
    System.out.println("Sum of 3rd row : "+s3);
    System.out.println("Sum of 1st column : "+s4);
    System.out.println("Sum of 2nd column : "+s5);
    System.out.println("Sum of 3rd column : "+s6);
    System.out.println("Sum of main diagonal : "+d1);
    System.out.println("Sum of optional diagonal : "+d2);
  }
  
}
