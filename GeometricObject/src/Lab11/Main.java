
package Lab11;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st side of the triangle: ");
    double s1 = input.nextDouble();
    System.out.print("Enter 2nd side of the triangle: ");
    double s2 = input.nextDouble();
    System.out.print("Enter 3rd side of the triangle: ");
    double s3 = input.nextDouble();
    input.nextLine();
    System.out.print("What is the color of the triangle: ");
    String color = input.nextLine();
    System.out.print("Is the triangle filled?(True/False): ");
    boolean filled = input.nextBoolean();
    
    Triangle triangle = new Triangle(s1,s2,s3);
    triangle.setcolor(color);
    triangle.setfilled(filled);
    System.out.println(triangle.toString());
  }
  
}
