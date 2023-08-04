
package task2;

public class CheckingsAccount extends BankAccount{
  
  private double serviceCharge;
  private double overdraftLimit=-50;
  
  public CheckingsAccount(){
    this.balance-=serviceCharge;
  }
  public double getSErviceCharge(){
    return serviceCharge;
  }
  public void setServiceCharge(double amount){
    this.serviceCharge=amount;
  }
  public void withdraw(double amount){
    if(this.balance-amount>=overdraftLimit){
      this.balance-=amount;
    }
    else{
      System.out.println("Insufficient fund");
    }
  }
  public String toString(){
    return super.toString();
  }
}
