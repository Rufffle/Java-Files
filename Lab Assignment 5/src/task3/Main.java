
package task3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
  
  public static void main(String[] args) {
    File file=new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Lab Assignment 5\\src\\task3\\Salary.txt");
    String [] ranks={"assistant","associate","full"};
    try(PrintWriter output=new PrintWriter(file)){
      for(int i=1;i<=50;i++){
        int rank=(int)(Math.random()*ranks.length);
        double salary=getSalary(rank);
        output.printf("FirstName%d LastName%d %s %.2f\n",i, i, ranks[rank],
                salary);
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
 public static double getSalary(int rank){
   double salary=0;
   switch(rank){
     
     case 0: 
       salary = (Math.random() * 50000) + 80000; 
       break;
     case 1: 
       salary = (Math.random() * 60000) + 110000; 
       break;
     case 2:
       salary = (Math.random() * 75000) + 130000;
   }
    return salary;
 } 
  
}
