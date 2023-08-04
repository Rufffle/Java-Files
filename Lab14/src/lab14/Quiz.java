
package lab14;
public class Quiz {
  
  private String id;
  private double mark;

  public Quiz() {
  }

  public Quiz(String id, double mark) {
    setId(id);
    setMark(mark);
  }
  public String getID(){
    return id;
  }

  public double getMark() {
    return mark;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setMark(double mark) {
    this.mark = mark;
  }

  void setMark(String mark) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  
}
