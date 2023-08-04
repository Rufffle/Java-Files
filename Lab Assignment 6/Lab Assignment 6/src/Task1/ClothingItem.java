
package Task1;

public class ClothingItem extends Product{

  private String fabricType;

  public ClothingItem() {
  }

  public ClothingItem(String fabricType) {
    this.fabricType = fabricType;
  }

  public ClothingItem(String fabricType, String name, double amount) {
    super(name, amount);
    setFabricType(fabricType);
  }

  public String getFabricType() {
    return fabricType;
  }

  public void setFabricType(String fabricType) {
    this.fabricType = fabricType;
  }
  
  @Override
  public void changePrice(double percentage) {
    double originalPrice = super.getAmount();
    double newPrice = originalPrice - (percentage/ 100) * originalPrice; 
    super.setAmount(newPrice);
  }

  @Override
  public String toString() {
    return "Name = "+super.getName()+"\tPrice = "+super.getAmount()+"\tFabric type= " + fabricType;
  }

  
  
  
  
}
