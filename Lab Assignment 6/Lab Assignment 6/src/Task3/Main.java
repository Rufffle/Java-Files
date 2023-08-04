
package Task3;

public class Main {
  
  public static void main(String[] args) throws CloneNotSupportedException {
    Octagon octagon1 = new Octagon(5);
    System.out.println(octagon1.toString());
    Octagon octagon2 = (Octagon)octagon1.clone();
    
    int result = octagon1.compareTo(octagon2);
    
    if(result > 0){
      System.out.println("The ares of 2nd Octagon is bigger than 1st one's");
    }
    else if(result < 0){
      System.out.println("The ares of 1st Octagon is bigger than 2nd one's");
    }
    else{
      System.out.println("Both area of the octagon's are the same");
    }
  }
  
}
