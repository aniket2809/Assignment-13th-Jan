import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();
        
        //Taking the basic salary
        System.out.println("Enter your basic salary");
        s.setBsal(sc.nextInt());

        //Computing the Annual Salary
        double tax=12*((s.getBsal()*10)/100);
        double bonus=12*((s.getBsal()*2)/100);
        double ta=12*((s.getBsal()*1.5/100));
        double asal=(12*s.getBsal())-tax+ta+bonus;

        //Priting the Annual Salary
        System.out.println("The annual salary is Rs."+asal+" with a deduction of Rs."+tax+" for annual taxes and a bonus of Rs."+bonus+" (calculated annually) and travel allowance of Rs."+ta+" (calculated annually)");
    }
}
