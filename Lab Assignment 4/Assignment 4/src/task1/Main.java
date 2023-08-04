
package task1;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = input.nextLine();
    System.out.print("Enter Address: ");
    String add = input.nextLine();
    System.out.print("Enter Age: ");
    int age = input.nextInt();
    System.out.print("Enter Base Salary: ");
    double bs = input.nextDouble();
    System.out.print("Enter Conveyeance: ");
    double con = input.nextDouble();
    System.out.print("Enter Deduction: ");
    double ded = input.nextDouble();
    System.out.print("Enter Average of Working Hour: ");
    double wh = input.nextDouble();
    System.out.print("Enter Hourly Salary: ");
    double hs = input.nextDouble();
    Employee emp = new Employee(name, add, age);
    RegularEmployee regemp = new RegularEmployee(name, add, age, bs, con, ded);
    HourlyEmployee houremp = new HourlyEmployee(name, add, age, hs, hs);
    System.out.println(emp.toString());
    System.out.println(regemp.toString());
    System.out.println(houremp.toString());
  }
  
}
