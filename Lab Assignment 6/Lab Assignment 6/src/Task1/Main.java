
package Task1;

public class Main {
  public static void main(String[] args) {
    Product p1 = new ElectronicDevice("Redmi Note 7", "1 year", "Xiome", 14999);
    ClothingItem p2 = new ClothingItem("Cotton", "Easy", 700);
    ElectronicDevice p3 = new ElectronicDevice("TV", "2 year", "Walton", 14999);
    p2.changePrice(-20);
    p3.changePrice(10);
    ((ElectronicDevice)p1).setWaranty("6 months");
    Product[] product = new Product[3];
    product[0] = p1;
    product[1] = p2;
    product[2] = p3;
    for(int i=0 ; i<3 ; i++){
      System.out.println(product[i].toString());
    }
  }
}
