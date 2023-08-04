
package lab.assignment.pkg2;

public class LabAssignment3 {

  public static void ComputeCube(){
    for(int i=0 ; i<100000 ; i++){
      int n=(int) Math.pow(i,3);
    }
  }
  
  public static void main(String[] args) {
    StopWatch stopwatchClassInstance = new StopWatch();
    stopwatchClassInstance.start();
    ComputeCube();
    stopwatchClassInstance.stop();
    System.out.println(stopwatchClassInstance.getElapsedTime());
  }
}
