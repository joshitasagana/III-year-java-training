import java.util.Scanner;
public class Onlinedelivery{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter order ammount: ");
        int ammount = sc.nextInt();

        System.out.print("Enter yes or no for premium member: ");
        String premium = sc.next();
        if((ammount>=1000)||premium.equalsIgnoreCase("yes"))
        {
            System.out.println("free delivery");
        }
        else{
            ammount=ammount+50;
            System.out.println("free delivery not available");
        }
        System.out.println(ammount);
    }
}