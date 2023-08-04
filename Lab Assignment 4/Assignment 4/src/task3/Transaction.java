
package task3;

import java.util.Date;

class Transaction extends Account{

  private Date date;
  private String type;
  private double amount;
  private double balance;
  private String description;
  public Transaction() {
    date = new Date();
  }
  public Transaction(char c, double amount, double balance, String withdraw) {
    setType(c);
    setAmount(amount);
    setBalance(balance);
    setDescription(withdraw);
  }
  public String getType(){
    return type;
  }
  public void setType(char c){
    this.type="c";
  }
  public Date getdateCreated(){
    return date;
  }
  public double getAmount(){
    return amount;
  }
  public void setAmount(double amount){
    this.amount = amount;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double balance){
    this.balance = balance;
  }
  public String getDescription(){
    return description;
  }
  public void setDescription(String withdraw){
    this.description=withdraw;
  }
  public String toString(){
    return super.toString();
  }
}
