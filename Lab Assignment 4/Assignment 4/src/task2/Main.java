
package task2;

public class Main {
  
  public static void main(String[] args) {
    BankAccount bank = new BankAccount("Roman", "191154");
    CheckingsAccount check = new CheckingsAccount();
    SavingsAccount save = new SavingsAccount();
    
    bank.deposit(100);
    bank.withdraw(2000);
    check.withdraw(500);
    System.out.println(bank.toString());
    System.out.println(check.toString());
    System.out.println(save.toString());
  }
  
}
