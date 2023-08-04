package assignment_2;
import java.util.Scanner;
public class Task2 {
  public static double computeSum(int[][] matrixA, int[][] matrixB){
    double sumrow = 0;
    for(int i=0 ; i<matrixB.length ; i++){
      for(int j=0 ; j<matrixB.length ; j++){
        sumrow += matrixB[i][j];
      }
      System.out.println("Sum of row #"+ (i+1) + " of MatrixA is : " + sumrow);
      sumrow = 0;
    }
    for(int i=0 ; i<matrixA.length ; i++){
      for(int j=0 ; j<matrixA.length ; j++){
        sumrow += matrixA[i][j];
      }
      System.out.println("Sum of column #"+ (i+1) + " of MatrixB is : " + sumrow);
      sumrow = 0;
    }
    return 1;
  }
  
  public static int[][] computeTranspose(int[][] matrix){
    int[][] matrixB = new int[matrix.length][matrix.length];
    
    for(int i=0 ; i<matrix.length ; i++){
      for(int j=0 ; j<matrix.length ; j++){
        matrixB[j][i] = matrix[i][j];
      }
    }
    System.out.println("Matrix A=>");
    for(int i=0 ; i<matrix[0].length ; i++){
      for(int j=0 ; j<matrix[0].length ; j++){
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println("");
    }
    System.out.println("\nMatrix B=>");
    for(int i=0 ; i<matrix[0].length ; i++){
      for(int j=0 ; j<matrix[0].length ; j++){
        System.out.print(matrixB[i][j] + "\t");
      }
      System.out.println("");
    }
    computeSum(matrix,matrixB);
    return matrixB;
  }
  
  public static double computeDiagonalSum(int[][] matrix){
    double diag1,diag2;
    diag1 = diag2 = 0;
    for(int i=0 ; i<matrix[0].length ; i++){
      for(int j=0 ; j<matrix[0].length ; j++){
        if(i==j){
          diag1+=matrix[i][j];
        }
        if((i+j)==(matrix[0].length-1)){
          diag2+=matrix[i][j];
        }
      }
    }
    double diag = diag1+diag2;
    return diag;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the dimension of the matrix (m x m) : ");
    int m = input.nextInt();
    int[][] matrix = new int[m][m];
    for(int i=0 ; i<matrix[0].length ; i++){
      for(int j=0 ; j<matrix[0].length ; j++){
        matrix[i][j] = input.nextInt();
      }
    }
    computeTranspose(matrix);
    
    double diagonalSum = computeDiagonalSum(matrix);
    
    System.out.println("Sum of the diagonals of the matrix is : "+ diagonalSum);
    
  }
  
}
