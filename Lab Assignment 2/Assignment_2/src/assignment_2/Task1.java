package assignment_2;
import java.util.Scanner;
public class Task1 {
  
  public static double computeDistance(double x1, double y1, double x2, double y2){
  
    double sum = Math.pow(( Math.abs(x2-x1) ), 2) + Math.pow(( Math.abs(y2-y1) ), 2);
    double d = Math.sqrt(sum);
    return d;
    
  }
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a co-ordinate (x1,y1) : ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.print("Enter another co-ordinate (x2,y2) : ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double dis = computeDistance(x1,y1,x2,y2);
    System.out.println("Distance between ("+x1+","+y1+") & ("+x2+","+y2+") is = "+dis);
    
  }
}
