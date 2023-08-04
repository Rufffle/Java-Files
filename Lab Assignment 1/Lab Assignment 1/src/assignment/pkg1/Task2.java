
package assignment.pkg1;

import java.util.Scanner;


public class Task2 {
  
  public static void main(String args[]){
  
    System.out.println("Please enter the number of students : ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int m;
    for(int i=1 ; i<=n ; i++){
      System.out.println("Please enter the mark of student #" + i + " :");
      m = scanner.nextInt();
      if(m>=93 && m<=100){
        System.out.println("Student " + i + " has a grade of A");
      }
      else if(m>=90 && m<=92){
        System.out.println("Student " + i + " has a grade of A-");
      }
      else if(m>=87 && m<=89){
        System.out.println("Student " + i + " has a grade of B+");
      }
      else if(m>=83 && m<=86){
        System.out.println("Student " + i + " has a grade of B");
      }
      else if(m>=80 && m<=82){
        System.out.println("Student " + i + " has a grade of B-");
      }
      else if(m>=77 && m<=79){
        System.out.println("Student " + i + " has a grade of C+");
      }
      else if(m>=73 && m<=76){
        System.out.println("Student " + i + " has a grade of C");
      }
      else if(m>=70 && m<=72){
        System.out.println("Student " + i + " has a grade of C-");
      }
      else if(m>=67 && m<=69){
        System.out.println("Student " + i + " has a grade of D+");
      }
      else if(m>=60 && m<=66){
        System.out.println("Student " + i + " has a grade of D");
      }
      else if(m>=0 && m<=60){
        System.out.println("Student " + i + " has a grade of F");
      }
      else{
        System.out.println("Error! Such marks do not exist");
      }
    System.out.println("\n");      
    }
    
  }
  
}
