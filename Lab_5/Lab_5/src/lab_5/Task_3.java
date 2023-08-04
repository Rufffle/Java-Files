
package lab_5;

import java.util.Scanner;


public class Task_3 {
  
  static double balance = 0;
  
  static void deposit(double amount){
    
    balance+=amount;
    System.out.println("Your balance is - "+balance);
    
    //return balance;

    
  }
  static void withdraw(double amount){
    
    balance-=amount;
    System.out.println("Your balance is - "+balance);
    //return balance;
    
  }
  
  public static void main(String[] args) {
  
    int n;
    
    do{
      System.out.print("1.Deposit\n2.Withdraw\n3.Balance\n4.Exit\n=>");
      Scanner input = new Scanner(System.in);
      n = input.nextInt();
      switch(n){
        case 1:
          System.out.print("Enter amount you want to deposit :");
          int depo = input.nextInt();
          deposit(depo);
          break;
        case 2:
          System.out.print("Enter amount you want to withdraw :");
          int with = input.nextInt();
          if(balance>with){
             withdraw(with);
          }
          else{
            System.out.println("You have insufficient balance");
          }
          break;
          
        case 3:
          System.out.println("Your balance is - "+balance);
          break;
          
        default:
          System.out.println("Wrong input!! Try again");
   
      }
      
    }while(n!=4);
    
    
    
    
  }
  
}
