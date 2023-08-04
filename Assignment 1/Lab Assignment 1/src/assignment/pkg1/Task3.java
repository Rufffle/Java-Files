
package assignment.pkg1;

import java.util.Scanner;

public class Task3 {
  public static void main(String args[]){
    
    long r1,r2;
    double r3,r4,r5,r6,r7,r8,result;
    System.out.print("Enter the value of a, b and c :");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    
    r1 = c*c*c;
    r2 = a*a*a*a*a*a;
    
    r3 = Math.sqrt(r1+r2);
    
    r4 = 2*a + (3*b*r3);
    
    r5 = Math.sqrt(Math.sqrt(c));
    r6 = (a*a)/((b*b)+r5);
    
    r7 = Math.tan(r6);
    r8 = Math.exp(r7);
    
    result = r4/r8;
    
    System.out.print("Result : " + result);
    System.out.print("\n");
    
  }

}
