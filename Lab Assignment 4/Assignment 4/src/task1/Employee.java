
package task1;

public class Employee {
  
  private String name;
  private String address;
  private int age;

  public Employee() {
  }
  
  public Employee(String name, String address, int age){
    this.name=name;
    this.address=address;
    this.age=age;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getAddress(){
    return address;
  }
  public void setAddress(String address){
    this.address=address;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age=age;
  }
  public String toString(){
    return "Name: "+getName()+" Address: "+getAddress()+" Age: "+getAge();
  }
}
