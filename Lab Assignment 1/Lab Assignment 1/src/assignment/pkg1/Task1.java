
package assignment.pkg1;

import java.util.Scanner;

public class Task1 {

  public static void main(String args[]) {
    
    System.out.print("Enter number (1<x<10):");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int i,j,sp;
    if(x<2 || x>9){
      do{
        System.out.println("Error! Enter number (1<x<10):");
        x = scanner.nextInt();
      }while(x<2 || x>9);
    }
    
    for(i=1 ; i<=x ; i++){
      for(sp=1 ; sp<=x-i ; sp++){
        System.out.print("   ");
      }
      for(j=1 ; j<=i ; j++){
        System.out.print(" " + j + " ");
      }
      for(j=i ; j>=1 ; j--){
        if(j==1){
          break;
        }
        else{
        System.out.print(" " + (j-1) + " ");
        }
      }
     System.out.print("\n");
    }
  }
}
 
