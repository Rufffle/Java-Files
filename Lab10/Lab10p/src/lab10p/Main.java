
package lab10p;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st side of the triangle: ");
    double t1 = input.nextDouble();
    System.out.print("Enter 2nd side of the triangle: ");
    double t2 = input.nextDouble();
    System.out.print("Enter 3rd side of the triangle: ");
    double t3 = input.nextDouble();
    System.out.print("Enter height of the rectangle: ");
    double r1 = input.nextDouble();
    System.out.print("Enter width of the rectangle: ");
    double r2 = input.nextDouble();
    input.nextLine();
    System.out.print("What is the color: ");
    String color = input.nextLine();
    System.out.print("Is the it filled?(True/False): ");
    boolean filled = input.nextBoolean();
    
    Object tri = new Triangle();
    Object rec = new Rectangle();
    ((Triangle)tri).setColor(color);
    ((Triangle)tri).setFilled(filled);
    ((Rectangle)rec).setColor(color);
    ((Rectangle)rec).setFilled(filled);
    System.out.println(DisplayObject(tri));
    System.out.println(DisplayObject(rec));
    
  }
  public static String DisplayObject(Object o){
    if(o instanceof Triangle){
      return (((Triangle)o).getArea()+"\t"+((Triangle)o).getPerimater()+"\t"+o.toString());
    }
    else if(o instanceof Rectangle){
      return (((Rectangle)o).getArea()+"\t"+((Rectangle)o).getPerimater()+"\t"+o.toString());
    }
    else{
      return null;
    }
  }
}
