
package lab6;

public class Fraction {
    private int numerator;
    private int denominator;
  public Fraction(int numerator,int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
    //System.out.println("1st Fraction number is " + toString());
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public void setNumerator(int numerator){
    this.numerator = numerator;
  }
  public void setDenominator(int denominator){
    this.denominator = denominator;
  }
  public String toString(){
    return "("+numerator+"/"+denominator+")";
  }
  public void add(Fraction f1,Fraction f2){
    System.out.print(f1.toString()+"+"+f2.toString()+" =>");
    int n1 = f1.numerator;
    int d1 = f1.denominator;
    int n2 = f2.numerator;
    int d2 = f2.denominator;
    int n3,d3;
    if(d1==d2){
      n3 = n1+n2;
      d3 = d1;
    }
    else{
      n3 = (n1*d2)+(n2*d1);
      d3 = (d1*d2);
    }
    this.numerator = n3;
    this.denominator = d3;
  }
  public void sub(Fraction f1,Fraction f2){
    System.out.print(f1.toString()+"-"+f2.toString()+" =>");
    int n1 = f1.numerator;
    int d1 = f1.denominator;
    int n2 = f2.numerator;
    int d2 = f2.denominator;
    int n3 = (n1*d2)-(n2*d1);
    int d3 = (d1*d2);
    this.numerator = n3;
    this.denominator = d3;
  }
  public void multiplication(Fraction f1,Fraction f2){
    System.out.print(f1.toString()+"*"+f2.toString()+" =>");
    int n1 = f1.numerator;
    int d1 = f1.denominator;
    int n2 = f2.numerator;
    int d2 = f2.denominator;
    int n3 = (n1*n2);
    int d3 = (d1*d2);
    this.numerator = n3;
    this.denominator = d3;
  }
  public void divison(Fraction f1,Fraction f2){
    System.out.print(f1.toString()+"/"+f2.toString()+" =>");
    int n1 = f1.numerator;
    int d1 = f1.denominator;
    int n2 = f2.numerator;
    int d2 = f2.denominator;
    int n3 = (n1*d2);
    int d3 = (n2*d1);
    this.numerator = n3;
    this.denominator = d3;
  }
 }

