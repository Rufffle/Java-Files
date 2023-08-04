
package lab.pkg7;

import java.util.Scanner;

public class Menu {
  
  Scanner userInput = new Scanner(System.in);
  Calculator calc = new Calculator();
  
  public int showMenu(){
    System.out.println("Enter operation\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
    
    int x = userInput.nextInt();
    
    return x;
  }
  public void handleMenuInput(){
    int n = showMenu();
    System.out.print("Enter a :");
    double a = userInput.nextDouble();
    System.out.print("Enter b :");
    double b = userInput.nextDouble();
    switch(n){
      case 1:
            double sum = calc.add(a, b);
            System.out.print(+a+" + "+b+" = "+sum);
            break;
      case 2:
            double sub = calc.subtract(a, b);
            System.out.print(+a+" + "+b+" = "+sub);
            break;
      case 3:
            double mul = calc.multiply(a, b); 
            System.out.print(+a+" + "+b+" = "+mul);
            break;
      case 4:
            double div = calc.divide(a, b); 
            System.out.print(+a+" + "+b+" = "+div);
            break;
      default:
            System.out.print("Wrong input");
    }
  }
  
}
