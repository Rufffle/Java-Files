
package Task3;

public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{

  private double side;

  public Octagon() {
  }

  public Octagon(double side) {
    setSide(side);
  }
  
  public Octagon(double side,String color,boolean filled) {
    super(color, filled);
    setSide(side);
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }
  
  public Object clone() throws CloneNotSupportedException{
    return (Octagon)super.clone();
  }
  
  @Override
  public double getArea() {
    double area = (2+(4/22))*side*side;
    return area;
  }

  @Override
  public double getPerimeter() {
    double perimeter = 8*side;
    return perimeter;
  }

  @Override
  public String toString() {
    return "Octogen => Area = "+getArea()+" Perimeter = "+getPerimeter()+" Color = "+super.getColor()+" Filled = "+super.isFilled();
  }

  public int compareTo(Octagon t) {
    if(getArea()>t.getArea()){
      return 1;
    }
    else if(getArea()<t.getArea()){
      return -1;
    }
    else{
      return 0;
    }
  }
  
}
