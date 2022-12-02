
package project1;

public class Project1 {
    
    public static void main(String[] args) {
        Department d1 = new Department(1,"Computer Science");
        
        SalaredEmployess se = new SalaredEmployess(2000, 500, 50, "Ahmed", "Gamal", 1200, Gender.male);
        d1.addEmp(se);
        
        HourlyEmployess he = new HourlyEmployess(100, 6, "Mohamed", "Cairo", 1200, Gender.male);
         d1.addEmp(he);
         
        CommisionEmployess ce = new CommisionEmployess(150000, 0.25, "Sahab", "Alex", 1200, Gender.female);
        d1.addEmp(ce);
        
        System.out.println(d1.getEmpCount());
        d1.printAllDetails();
        d1.ptintBasicData();
    }
    
}
