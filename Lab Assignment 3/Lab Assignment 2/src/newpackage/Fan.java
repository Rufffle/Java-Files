
package newpackage;

public class Fan {
  
  final int SLOW = 1;
  final int MEDIUM = 2;
  final int FAST = 3;
  private int speed;
  private boolean fanCondition;
  private double radius;
  private String color;
  
  Fan(){
    speed=1;
    fanCondition=false;
    radius=5;
    color="blue";
  }
  public void Accessor(int s, boolean f, double r, String c){
    this.speed=s;
    this.fanCondition=f;
    this.radius=r;
    this.color=c;
  }
  public String toString(){
    if(fanCondition==false){
      return "The fan is turned off. Fan color is "+color+" and radius is "+radius;
    }
    else{
      if(speed==1){
        return "Speed of the fan is "+speed+". Fan color is "+color+" and radius is "+radius;
      }
      else if(speed==2){
        return "Speed of the fan is "+speed+". Fan color is "+color+" and radius is "+radius;
      }
      else{
        return "Speed of the fan is "+speed+". Fan color is "+color+" and radius is "+radius;
      }
    }
  }
}
