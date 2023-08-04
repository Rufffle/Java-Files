
package task1;

public class RegularEmployee extends Employee{
  
  private double baseSalary;
  private double conveyance;
  private double deduction;
  
  public RegularEmployee(){
    
  }
  public RegularEmployee(String name, String address, int age, double base, double con, double deduction){
    super.setName(name);
    super.setAddress(address);
    super.setAge(age);
    this.baseSalary=base;
    this.conveyance=con;
    this.deduction=deduction;
  }
  
  public double getBaseSAlary(){
    return baseSalary;
  }
  public void setBaseSalary(double base){
    this.baseSalary=base;
  }
  public double getConveyance(){
    return conveyance;
  }
  public void setConveyance(double con){
    this.conveyance=con;
  }
  public double getDeduction(){
    return deduction;
  }
  public void setDeduction(double deduction){
    this.deduction=deduction;
  }
  public double computeAnnualSalary(){
    return (baseSalary+conveyance-deduction)*12;
  }
  public String toString(){
    return (super.toString()+" Base Salary: "+baseSalary+" Conveyence: "+conveyance+" Deduction: "+deduction);
  }
}
