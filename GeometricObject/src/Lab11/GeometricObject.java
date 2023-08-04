
package Lab11;
import java.util.Date;
public class GeometricObject {
  private String color = "White";
  private boolean filled;
  private Date dateCreated;
  public GeometricObject(){
    dateCreated = new Date();
  }
  public GeometricObject(String color, boolean filled){
    this.color = color;
    this.filled = filled;
    dateCreated = new Date();
  }
  public String getcolor(){
    return color;
  }
  public void setcolor(String color){
    this.color = color;
  }
  public boolean getFilled(){
    return filled;
  }
  public void setfilled(boolean filled){
    this.filled = filled;
  }
  public String toString(){
    return "Created on: "+dateCreated+"\tColor: "+color+"\tFilled: "+filled;
  }
}
