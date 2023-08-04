
package lab.assignment.pkg2;

public class StopWatch {
  
  private long startTime;
  private long stopTime;

  public StopWatch() {
    this.startTime=System.currentTimeMillis();
  }
  public long getStartTime(){
    return startTime;
  }
  public long getStopTime(){
    return stopTime;
  }
  public void start(){
    this.startTime=System.currentTimeMillis();
  }
  public void stop(){
    this.stopTime=System.currentTimeMillis();
  }
  public long getElapsedTime(){
    return stopTime-startTime;
  }
}
