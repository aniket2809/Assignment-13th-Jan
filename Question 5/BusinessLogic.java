import java.util.*;

public class BusinessLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        User u = new User();
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();

        //Taking the value of the first Laptop
        System.out.println("----------Entering values of the first laptop----------");
        System.out.println("Enter the brand name");
        l1.setBrand(sc.next());
        System.out.println("Enter the price of the laptop");
        l1.setPrice(sc.nextInt());
        System.out.println("Enter the processor");
        l1.setProcessor(sc.next());

        //Taking the value of the second Laptop
        System.out.println("----------Entering values of the second laptop----------");
        System.out.println("Enter the brand name");
        l2.setBrand(sc.next());
        System.out.println("Enter the price of the laptop");
        l2.setPrice(sc.nextInt());
        System.out.println("Enter the processor");
        l2.setProcessor(sc.next());

        //Taking the value of the third Laptop
        System.out.println("----------Entering values of the third laptop----------");
        System.out.println("Enter the brand name");
        l3.setBrand(sc.next());
        System.out.println("Enter the price of the laptop");
        l3.setPrice(sc.nextInt());
        System.out.println("Enter the processor");
        l3.setProcessor(sc.next());

        //Taking the user details
        System.out.println("Enter user name");
        u.setUsername(sc.next());
        System.out.println("Enter user address");
        u.setAddress(sc.next());

        //Comparing the processors of the laptop
        System.out.println("Brand : "+l1.getBrand()+"\t\t"+"Processor: "+l1.getProcessor());
        System.out.println("Brand : "+l2.getBrand()+"\t\t"+"Processor: "+l2.getProcessor());
        System.out.println("Brand : "+l3.getBrand()+"\t\t"+"Processor: "+l3.getProcessor());

        //Choosing the laptop
        System.out.println("Choose the processor you want to buy");
        String choose=sc.next();
        
        if(choose.equalsIgnoreCase(l1.getProcessor()))
        {
            System.out.println(u.getUsername()+" residing at "+u.getAddress()+" wants to buy "+l1.getBrand()+" having a price of "+l1.getPrice()+" with "+l1.getProcessor()+" processor.");
        }
        else if(choose.equalsIgnoreCase(l2.getProcessor()))
        {
            System.out.println(u.getUsername()+" residing at "+u.getAddress()+" wants to buy "+l2.getBrand()+" having a price of "+l2.getPrice()+" with "+l2.getProcessor()+" processor.");
        }
        else if(choose.equalsIgnoreCase(l3.getProcessor()))
        {
            System.out.println(u.getUsername()+" residing at "+u.getAddress()+" wants to buy "+l3.getBrand()+" having a price of "+l3.getPrice()+" with "+l3.getProcessor()+" processor.");
        }
        else
            System.out.println("None of the laptop has "+choose+" processor");
    }
}
