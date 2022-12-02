
package project1;

public class BasePluseCommissionEmployee extends CommisionEmployess{
    
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double earnings() {
        return base*super.earnings();
    }
    @Override
    public void DisplayallDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void Displayearnings() {
        System.out.println(earnings());
    }
    
}
