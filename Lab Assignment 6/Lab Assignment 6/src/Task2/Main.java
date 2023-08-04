
package Task2;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is the color of the triangle? => ");
    String color = input.nextLine();
    System.out.print("Is the triangle filled? => ");
    boolean filled = input.nextBoolean();
    System.out.print("First side of the triangle => ");
    double s1 = input.nextDouble();
    System.out.print("Second side of the triangle => ");
    double s2 = input.nextDouble();
    System.out.print("Third side of the triangle => ");
    double s3 = input.nextDouble();
    
    GeometricObject triangle = new Triangle(s1, s2, s3, color, filled);
    System.out.println(triangle.toString());
  }
  
}
