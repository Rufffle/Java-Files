
package lab_5;

public class Lab_5 {

 public static boolean addition(int a, int b){
   
    if((a+b)>10){
      return true;
    }
    else{
      return false;
    }
  } 
 public static void main(String[] args) {
    int a = 5;
    int b = 6;
    addition(a, b);
    System.out.println(addition(a,b));
  }
  
}
