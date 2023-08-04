package lab14;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) throws Exception {
    
    File file = new File("C:\\Users\\LIB-609\\Documents\\NetBeansProjects\\Lab14\\src\\lab14\\New.txt");
    Quiz[] quiz = new Quiz[4];
    Scanner input = new Scanner(file);
    //int i=0;
    for(int i=0;i<4 ; i++){
      String ID = input.next();
      int mark = input.nextInt();
      quiz[i] = new Quiz(ID, mark);
      System.out.printf("ID: %s\tMarks: %d\n",ID,mark);
    }
    File filee = new File("C:\\Users\\LIB-609\\Documents\\NetBeansProjects\\Lab14\\src\\image.txt");
    
    PrintWriter output = new PrintWriter(filee);
    for(int i=0;i<4 ; i++){
      output.print("ID: "+quiz[i].getID());
      output.print("\tmark: "+quiz[i].getMark()+"\n");
    }
    output.print("Highest mark obtained by ID: "+Highest(quiz));
    output.close();
  }
  
  public static String Highest(Quiz[] obj){
    //Quiz[] q = new Quiz[4];
    double high;
    high = obj[0].getMark();
    for(int i=1 ; i<4 ; i++){
      if(obj[i].getMark()>high){
        high=obj[i].getMark();
      }
    }
    for(int i=0 ; i<4 ; i++){
      if(obj[i].getMark()==high){
        return obj[i].getID();
      }
    }
    return null;
  }
  
}
