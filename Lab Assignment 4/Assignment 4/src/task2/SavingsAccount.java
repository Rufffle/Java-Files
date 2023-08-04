
package task2;

public class SavingsAccount extends BankAccount{
  
  private double interestAmount;

  public SavingsAccount() {
    this.balance+=interestAmount;
  }
  public double getInterestAmount(){
    return interestAmount;
  }
  public void setInterestAmount(double amount){
    this.interestAmount=amount;
  }
  public String toString(){
    return super.toString();
  }
}
