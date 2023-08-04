
package lab10p;

public class Rectangle extends GeomatricObject{
  double side1=1.0;
  double side2=1.0;
  
  public Rectangle(){
  } 
  public Rectangle(double side1,double side2){   
    this.side1=side1;
    this.side2=side2;
  }
  public double getSide1(){
    return side1;
  }
  public double getSide2(){
    return side2;
  }
  public double getPerimater(){
    return 2*(side1+side2);
  }
  public double getArea(){
    return (side1*side2);
  }
  public String toString(){
    return (super.toString()+" Area of the Rectangle: "+getArea()+" Rectangle:"+getPerimater());
  }
}
