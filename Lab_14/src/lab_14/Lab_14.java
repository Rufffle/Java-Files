package lab_14;


public class Lab_14 implements compareArea{

  public static void main(String[] args) {
    Triangle tri = new Triangle(3, 4, 5);
    Rectangle rec = new Rectangle(5, 10);
    tri.setArea();
    rec.setArea();
    System.out.println("Area of triangle = "+tri.getArea());
    System.out.println("Area of tectangle = "+rec.getArea());
    //boolean compareArea = compareArea(tri, rec);
    Lab_14 lab = new Lab_14();
    boolean result = lab.compareArea(tri, rec);
    System.out.println("Are the area of triangle and area of rectangle same? => "+result);
    
  }

  @Override
  public <E extends GeometricObject> boolean compareArea(E triangle, E rectangle) {
    return triangle.getArea()==rectangle.getArea();
  }
  
}