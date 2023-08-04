
package newpackage1;

import java.util.Scanner;

public class Main_method {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter row and colum of the matrix -> ");
    int x = input.nextInt();
    int y = input.nextInt();
    Matrix mat1 = new Matrix(x,y);
    mat1.setRow(x);
    mat1.setColumn(y);
    System.out.print("Enter elements of matrix(3x3) -> ");
    mat1.InputMatrix();
    mat1.OutputMatrix();
    double maximumNumb = mat1.MaxElement();
    System.out.print("Maximum number is -> "+maximumNumb);
  }
  
}
