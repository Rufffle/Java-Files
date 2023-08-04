
package task1;

public class Patient {
  
  private String name;
  private int age;
  private String disease;

  public Patient(){
    
  }
  public Patient(String name, int age, String disease) {
    setName(name);
    setAge(age);
    setDisease(disease);
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    try{
      if(name.length()<=3){
        throw new Exception("Name must have more then 3 alphabets");
      }
        this.name = name;
    }
    catch(Exception e){
      System.out.println(e);
    }
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public String getDisease(){
    return disease;
  }
  public void setDisease(String disease){
    this.disease=disease;
  }
  public String toString() {
    return "Patient's name=" + name + ", age=" + age + ", disease=" + disease ;
  }
  
}
