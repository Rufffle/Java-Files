
package task1;

public class Main {
  
  public static void main(String[] args) {
  
    Patient pat1 = new Patient("Tom", 12, "Fever");
    Patient pat2 = new Patient("Sa", 40, "Cancer");
    Patient pat3 = new Patient("Chirs", 32, "Jondis");    
    System.out.println(pat1.toString());
    System.out.println(pat2.toString());
    System.out.println(pat3.toString());
  }
  
}
