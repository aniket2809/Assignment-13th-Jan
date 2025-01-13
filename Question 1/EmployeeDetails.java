public class EmployeeDetails {
    private String ename;
    private String designation;
    private int salary;
    private String email;

    //Adding Getters & Setters of the instance variables

    public String getEname(){
        return this.ename;
    }
    public void getEname(String ename){
        this.ename = ename;
    }

    public String getDesignation(){
        return this.designation;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }

    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getEmail(){
        return this.email;
    }
    public void getEmail(String email){
        this.email=email;
    }
}
