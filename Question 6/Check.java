import java.util.*;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Address a = new Address();
        System.out.println("Do you have a address");
        a.setAdr(sc.nextBoolean());
        if (a.isAdr())
            System.out.println("The user have a address");
        else
            System.out.println("The user do not have a address");
    }
}