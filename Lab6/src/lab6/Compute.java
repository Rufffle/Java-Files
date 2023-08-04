
package lab6;

import java.util.Scanner;

public class Compute {
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter numerator of 1st fraction : ");
    int num1 = input.nextInt();
    System.out.print("Enter denominator of 1st fraction : ");
    int den1 = input.nextInt();
    System.out.print("Enter numerator of 2nd fraction : ");
    int num2 = input.nextInt();
    System.out.print("Enter denominator of 2nd fraction : ");
    int den2 = input.nextInt();
    Fraction f1 = new Fraction(num1,den1);
    Fraction f2 = new Fraction(num2,den2);
    Fraction f3 = new Fraction(1,1);
    f3.add(f1, f2);
    System.out.println(" "+ f3.toString());
    f3.sub(f1, f2);
    System.out.println(" "+ f3.toString());
    f3.multiplication(f1, f2);
    System.out.println(" "+ f3.toString());
    f3.divison(f1, f2);
    System.out.println(" "+ f3.toString());
  }

}
