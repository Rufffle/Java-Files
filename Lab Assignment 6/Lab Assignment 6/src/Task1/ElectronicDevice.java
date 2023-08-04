
package Task1;

public class ElectronicDevice extends Product{

  private String model;
  private String waranty;

  public ElectronicDevice() {
  }

  public ElectronicDevice(String model, String waranty) {
    this.model = model;
    this.waranty = waranty;
  }

  public ElectronicDevice(String model, String waranty, String name, double amount) {
    super(name, amount);
    setWaranty(waranty);
    setModel(model);
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getWaranty() {
    return waranty;
  }

  public void setWaranty(String waranty) {
    this.waranty = waranty;
  }
  
  @Override
  public void changePrice(double percentage) {
    double originalPrice = super.getAmount();
    double newPrice = originalPrice - (percentage/ 100) * originalPrice; 
    super.setAmount(newPrice);
  }

  @Override
  public String toString() {
    return "Name = "+super.getName()+"\tPrice = "+super.getAmount()+"\tModel = " + model + "\tWaranty = " + waranty;
  }

  
}
