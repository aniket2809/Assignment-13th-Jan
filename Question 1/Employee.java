public class Employee {
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails();
        e.getEname("Test_User");
        e.setDesignation("Developer");
        e.setSalary(50000);
        e.getEmail("Test@user.com");
        System.out.println(e.getEname()+" works as "+e.getDesignation()+" with email id "+e.getEmail()+" and earns "+e.getSalary()+" per annum");
    }
    
}
