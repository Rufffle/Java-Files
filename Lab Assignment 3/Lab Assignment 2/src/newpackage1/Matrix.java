
package newpackage1;

import java.io.InputStream;
import java.util.Scanner;

public class Matrix {
  
  double[][] mat;
  private int row=3;
  private int col=3;
  
  Matrix(){
    double[][] mat=new double[row][col];
  }

  Matrix(int a, int b){
    mat= new double[a][b];
  }
    
  public int getRow(){
    return row;
  }
  public int getColumn(){
    return col;
  }
  public void setRow(int a){
    this.row=a;
  }
  public void setColumn(int b){
    this.col=b;

  } 

  public void InputMatrix(){
    Scanner input= new Scanner(System.in);
    for(int i=0 ; i<row ; i++){
      for(int j=0; j<col ; j++){
        mat[i][j]=input.nextInt();
      }
    }
  }
  public void OutputMatrix(){
    System.out.println("The matrix is ->");
    for(int i=0 ; i<row ; i++){
      for(int j=0; j<col ; j++){
        System.out.print(" "+mat[i][j]);
      }
      System.out.println(" ");
    }
  }
  public double MaxElement(){
    double max=0;
    for(int i=0 ; i<row ; i++){
      for(int j=0; j<col ; j++){
        if(max<mat[i][j]){
          max=mat[i][j];
        }
      }
    }
    return max;
  }
}
