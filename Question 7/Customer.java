import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        //Taking the inputs for the first mobile
        System.out.println("Enter the brand of the mobile");
        m1.setBrand(sc.next());
        System.out.println("Enter price of the mobile");
        m1.setPrice(sc.nextInt());
        System.out.println("Enter the android version of the mobile");
        m1.setAndroidVersion(sc.nextInt());

        //Taking the inputs for the second mobile
        System.out.println("Enter the brand of the mobile");
        m2.setBrand(sc.next());
        System.out.println("Enter price of the mobile");
        m2.setPrice(sc.nextInt());
        System.out.println("Enter the android version of the mobile");
        m2.setAndroidVersion(sc.nextInt());

        //Taking the inputs for the third mobile
        System.out.println("Enter the brand of the mobile");
        m3.setBrand(sc.next());
        System.out.println("Enter price of the mobile");
        m3.setPrice(sc.nextInt());
        System.out.println("Enter the android version of the mobile");
        m3.setAndroidVersion(sc.nextInt());

        //Customer Interface
        System.out.println("----------Welcome to the Shop----------");
        System.out.println("Enter the brand you want to purchase");
        String cbrand = sc.next();

        //Checking the brand name
        if (m1.getBrand().equalsIgnoreCase(cbrand) || m2.getBrand().equalsIgnoreCase(cbrand) || m3.getBrand().equalsIgnoreCase(cbrand))
        {
            System.out.println("Enter the android version you want");
            int candroid = sc.nextInt();

            //Checking Android Version
            if(m1.getBrand().equalsIgnoreCase(cbrand) && m1.getAndroidVersion() == candroid)
                System.out.println("Device available "+m1.getAndroidVersion()+m1.getBrand());
            else if(m2.getBrand().equalsIgnoreCase(cbrand) && m2.getAndroidVersion() == candroid)
                System.out.println("Device available "+m2.getAndroidVersion()+m2.getBrand());
            else if(m3.getBrand().equalsIgnoreCase(cbrand) && m3.getAndroidVersion() == candroid)
                System.out.println("Device available "+m3.getAndroidVersion()+m3.getBrand());
            else
                System.out.println("Sorry we don't have an android "+candroid+" available from the brand "+cbrand);
        }
        else
            System.out.println("Sorry we don't have phones of that brand in our shop");
    }
}
