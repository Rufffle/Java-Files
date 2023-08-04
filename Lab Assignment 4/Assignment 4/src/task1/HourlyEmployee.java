
package task1;

public class HourlyEmployee extends Employee{
  
  private double avgWorkingHour;
  private double hourlySalary;
  
  public HourlyEmployee(){
    
  }
  public HourlyEmployee(String name, String address, int age, double hour, double salary){
    super.setName(name);
    super.setAddress(address);
    super.setAge(age);
    this.avgWorkingHour=hour;
    this.hourlySalary=salary;
  }
  public double getAvgWorkingHour(){
    return avgWorkingHour;
  }
  public void setgetAvgWorkingHour(double hour){
    this.avgWorkingHour=hour;
  }
  public double getHourlySalary(){
    return hourlySalary;
  }
  public void setHourlySalary(double salary){
    this.hourlySalary=salary;
  }
  public double computeAnnualSalary(){
    return hourlySalary*avgWorkingHour*5*52;
  }
  public String toString(){
    return (super.toString()+"Average Working Hour: "+avgWorkingHour+"Hourly Salary: "+hourlySalary);
  }
}
