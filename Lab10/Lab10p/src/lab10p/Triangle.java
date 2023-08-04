
package lab10p;

public class Triangle extends GeomatricObject{
  private double side1=1;
  private double side2=1;
  private double side3=1;
  
  public Triangle(){

  }
  public Triangle(double s1, double s2, double s3){
    this.side1=s1;
    this.side2=s2;
    this.side3=s3;
  }
  public double getSide1(){
    return side1;
  }
  public double getSide2(){
    return side2;
  }
  public double getSide3(){
    return side3;
  }
  public double getPerimater(){
    return (side1+side2+side3)/2;
  }
  public double getArea(){
    double p = getPerimater();
    return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
  }
  public String toString(){
    return (super.toString()+" Area of the Triangle: "+getArea()+" Perimeter:"+getPerimater());
  }
}
