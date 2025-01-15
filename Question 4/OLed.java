import java.util.*;

public class OLed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Led l = new Led();
        Led l1 = new Led();

        //Taking values for the first brand
        System.out.println("----------Entering the values for the first brand----------");
        System.out.println("Enter the brand name");
        l.setBrand(sc.next());
        System.out.println("Enter the id for the model");
        l.setId(sc.nextInt());
        System.out.println("Enter the price");
        l.setPrice(sc.nextInt());


        //Taking values for the second brand
        System.out.println("----------Entering the values for the second brand----------");
        System.out.println("Enter the brand name");
        l1.setBrand(sc.next());
        System.out.println("Enter the id for the model");
        l1.setId(sc.nextInt());
        System.out.println("Enter the price");
        l1.setPrice(sc.nextInt());
        
        //Comparing the prices and priting the output
        if(l.getPrice()>l1.getPrice())
            System.out.println("Premium Model is "+l.getBrand()+" with id "+l.getId()+" with a price of "+l.getPrice());

        else
            System.out.println("Premium Model is "+l1.getBrand()+" with id "+l1.getId()+" with a price of "+l1.getPrice());
    }
}
