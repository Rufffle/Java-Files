
package task2;

public class BankAccount {
  
  protected double balance = 1000;
  private String customerName;
  private String accountNo;
  
  public BankAccount(){
    
  }
  public BankAccount(String name, String acc){
    setCustomerName(name);
    setAccountNo(acc);
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double bal){
    this.balance=bal;
  }
  public String getCustomerName(){
    return customerName;
  }
  public void setCustomerName(String name){
    this.customerName=name;
  }
  public String getAccountNo(){
    return customerName;
  }
  public void setAccountNo(String acc){
    this.accountNo=acc;
  }
  public void deposit(double amount){
    this.balance+=amount;
  }
  public void withdraw(double amount){
    if(this.balance-amount>=500){
      this.balance-=amount;
    }
    else{
      System.out.println("Insufficient Balance");
    }
  }
  public String toString(){
    return "Customer name: "+this.customerName+" Account No.: "+this.accountNo+" Balance: "+this.balance;
  }
}
