
package lab.pkg13;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

    Patient b = new Patient();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter patient name : ");
    String a1 = input.nextLine();
    System.out.print("Enter patient disease : ");
    String a2 = input.nextLine();
    input.nextLine();
    System.out.print("Enter patient age : ");
    int a3 = input.nextInt();
    Patient a = new Patient(a1, a3, a2);
  }
  
}
