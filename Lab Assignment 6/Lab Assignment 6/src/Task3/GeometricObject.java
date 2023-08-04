
package Task3;

import java.util.Date;

public abstract class GeometricObject {
  
  private String color;
  private boolean filled;
  private Date dateCreated;

  protected GeometricObject() {
  }

  protected GeometricObject(String color, boolean filled) {
    setColor(color);
    setFilled(filled);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }
  
  public abstract double getArea();
  public abstract double getPerimeter();
  public abstract String toString();
  
}
