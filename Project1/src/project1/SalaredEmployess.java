
package project1;

public class SalaredEmployess extends Employee implements Displayable{
    private double salary,bouns,deductions;

    public SalaredEmployess(double salary, double bouns, double deductions, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }

    public SalaredEmployess() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
    @Override
    public double earnings() {
       return (salary+bouns) - deductions;
    }

    @Override
    public void DisplayallDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SalaredEmployess{" + "salary=" + salary + ", bouns=" + bouns + ", deductions=" + deductions + '}';
    }

    @Override
    public void Displayearnings() {
        System.out.println(earnings());
    }
    
}
