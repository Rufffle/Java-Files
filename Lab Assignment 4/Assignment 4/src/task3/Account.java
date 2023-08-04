
package task3;

import java.util.ArrayList;
import java.util.Date;

public class Account {
  
  private int id;
  private double balance;
  private String name;
  private double annualInterestRate;
  private Date dateCreated;
  private String customerName;
  private String accountNo;
  private ArrayList<Transaction> transactions;
  public Account(){
    dateCreated = new Date();
    transactions = new ArrayList<>();
  }
  public Account(String name, int id, double balance){
    setName(name);
    setId(id);
    setBalance(balance);
  }
  
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public double getAnnualInterestRate(){
    return annualInterestRate;
  }
  public void setAnnualInterestRate(double rate){
    this.annualInterestRate=rate;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double balance){
    this.balance = balance;
  }
  public String getCustomerName(){
    return customerName;
  }
  public void setCustomerName(String customer){
    this.customerName=customer;
  }
  public String getAccountNo(){
    return accountNo;
  }
  public void setAccountNo(String acc){
    this.accountNo=acc;
  }
  public Date getdateCreated(){
    return dateCreated;
  }
  public void deposit(double amount) {
    transactions.add(new Transaction('D', amount, this.balance, "deposit"));
    balance += amount;
  }
  public void withdraw(double amount) {
    transactions.add(new Transaction('W', amount, this.balance, "withdraw"));
    balance -= amount;
  }
  public ArrayList<Transaction> getTransactions() {
    return new ArrayList<>(transactions);
  }
  public String toString() {
    return "\nAccount name: " + name + "\tInterest rate: " + annualInterestRate + "%\tBalance: "+balance+"\tTransaction: " + transactions;
  }
}
