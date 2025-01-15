public class Palindrone {

    public static void main(String[] args) {
        String name = args[0];

        //Checking for Palindrone
        if (isPalindrone(name.toLowerCase()))
            System.out.println(name+" is a Palindrone Name"); 
        else
            System.out.println(name+" is not a Palindrone Name");
        
    }

    //Method to check Palindrone Number
    public static boolean isPalindrone(String pal) {
        int left = 0;
        int right = pal.length() - 1;

        //Logic of Palindrone
        while (left < right) {
            if (pal.charAt(left) != pal.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
