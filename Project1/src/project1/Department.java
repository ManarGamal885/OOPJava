package project1;

import java.util.ArrayList;

public class Department {

    int dNum;
    String dName;
    //POLYMERPHISM
    ArrayList<Employee> empList;

    public Department() {
    }

    public Department(int dNum, String dName) {
        this.dNum = dNum;
        this.dName = dName;
        empList = new ArrayList<Employee>();
    }

    public int getdNum() {
        return dNum;
    }

    public void setdNum(int dNum) {
        this.dNum = dNum;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public void addEmp(Employee emp) {
        empList.add(emp);
    }

    public void removeEmp(int idx) {
        empList.remove(idx);
    }

    public int getEmpCount() {
        return empList.size();
    }

    public void ptintBasicData() {
        for (int i = 0; i < empList.size(); i++) {
            System.out.println(empList.get(i).getSsn() + " " + empList.get(i).getName() + " " + empList.get(i).getAddress());
        }
    }

    public void printAllDetails() {
        /*when the user fills the empList with employees it will contains 3types of employees
         and it maybe (salaredEmp - comisionEmp or horelyEmp)
         so we neeed to know the type first and then we cast it to the specified emp type after that each type we call its (displayAll) method, and it goes as follows
        */
        //TYPE CASTING
        for (int i = 0; i < empList.size(); i++) {
            if(empList.get(i) instanceof SalaredEmployess){
               ((SalaredEmployess)empList.get(i)).DisplayallDetails();
            }
            if (empList.get(i) instanceof HourlyEmployess) {
                ((HourlyEmployess)empList.get(i)).DisplayallDetails();
            }
            if (empList.get(i) instanceof CommisionEmployess) {
                ((CommisionEmployess)empList.get(i)).DisplayallDetails();
            }
        }
    }
}
