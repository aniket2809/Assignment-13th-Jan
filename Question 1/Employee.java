import java.util.*;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails e = new EmployeeDetails();
        
        System.out.println("Enter employee name");
        String name = sc.next();
        System.out.println("Enter employee designation");
        String disg = sc.next();
        System.out.println("Enter employee sal");
        int sal = sc.nextInt();
        System.out.println("Enter employee email");
        String email = sc.next();
        e.getEname(name);
        e.setDesignation(disg);
        e.setSalary(sal);
        e.getEmail(email);
        System.out.println(e.getEname()+" works as "+e.getDesignation()+" with email id "+e.getEmail()+" and earns "+e.getSalary()+" per annum");
    }
    
}
