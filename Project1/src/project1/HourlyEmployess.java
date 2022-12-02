
package project1;

public class HourlyEmployess extends Employee implements Displayable{

    public HourlyEmployess(double hoyrRate, int numberOfHours, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.hoyrRate = hoyrRate;
        this.numberOfHours = numberOfHours;
    }

    public HourlyEmployess() {
    }
    private double hoyrRate;
    private int numberOfHours;

    public double getHoyrRate() {
        return hoyrRate;
    }

    public void setHoyrRate(double hoyrRate) {
        this.hoyrRate = hoyrRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public String toString() {
        return "HourlyEmployess{" + "hoyrRate=" + hoyrRate + ", numberOfHours=" + numberOfHours + '}';
    }

    @Override
    public double earnings() {
        return numberOfHours*hoyrRate ;
    }

    @Override
    public void DisplayallDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void Displayearnings() {
        System.out.println(toString());
    }
}
