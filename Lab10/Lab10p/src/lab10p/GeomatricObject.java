package lab10p;

import java.util.Date;

public class GeomatricObject {
  private String color = "White";
  private boolean filled;
  private Date dateCreated;
  
  public GeomatricObject(){
    dateCreated = new Date();
  }
  public GeomatricObject(String color, Boolean filled){
    this.color=color;
    this.filled=filled;
    dateCreated=new Date();
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color=color;
  }
  public boolean getFilled(){
    return filled;
  }
  public void setFilled(boolean Filled){
    this.filled=filled;
  }
  public String toString(){
    return "Created on: "+dateCreated+" Color: "+color+" Filled: "+filled;
  }
}
