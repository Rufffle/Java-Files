package lab.pkg13;

public class Patient {
  
  private String name;
  private int age;
  private String disease;
  
  public Patient(){
    
  }
  public Patient(String name, int age, String disease){
    try {
      setName(name);
    } 
    catch (InvalidNameException ex) {
      System.out.println(ex.getMessage());
    }
    try {
      setAge(age);
    } 
    catch (IllegalArgumentException ar){
      System.out.println(ar.getMessage());
    }
    this.disease=disease;
  }
  public String getName(){
    return name;
  }
  public void setName(String name)
  throws InvalidNameException{
    if(name.length()<3){
     throw new InvalidNameException("Name contains less than 3 letters");
    }
    this.name=name;
  }
  public void setAge(int age)
    throws IllegalArgumentException{
    if(age<0){
      throw new IllegalArgumentException("Age is negative");
    }
  }
  public int getAge(){
    return age;
  }
}
