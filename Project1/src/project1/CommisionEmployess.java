
package project1;

public class CommisionEmployess extends Employee implements Displayable{
    private double gross_salary, commission_rate;

    public CommisionEmployess() {
    }

    public double getGross_salary() {
        return gross_salary;
    }

    public void setGross_salary(double gross_salary) {
        this.gross_salary = gross_salary;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    @Override
    public String toString() {
        return "CommisionEmployess{" + "gross_salary=" + gross_salary + ", commission_rate=" + commission_rate + '}';
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    @Override
    public double earnings() {
        return gross_salary *commission_rate;
    }

    @Override
    public void DisplayallDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    public CommisionEmployess(double gross_salary, double commission_rate, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.gross_salary = gross_salary;
        this.commission_rate = commission_rate;
    }

    @Override
    public void Displayearnings() {
        System.out.println(earnings());
    }
    
}
