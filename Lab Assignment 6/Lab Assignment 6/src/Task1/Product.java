
package Task1;
public abstract class Product {
  
  private String name;
  private double amount;

  protected Product() {
  }

  protected Product(String name, double amount) {
    setName(name);
    setAmount(amount);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
  public abstract void changePrice(double percentage);

  public abstract String toString();

}
