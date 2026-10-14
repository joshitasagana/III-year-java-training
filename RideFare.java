import java.util.Scanner;

public class RideFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in kilometres:");
        double distance = sc.nextDouble();

        System.out.println("Enter waiting time in minutes:");
        int waiting = sc.nextInt();

        System.out.println("Are you a premium member? (yes/no)");
        String member = sc.next();

        boolean premium = member.equalsIgnoreCase("yes");

        if (distance <= 0 || waiting < 0) {
            System.out.println("Invalid Input");
        } else {
            double fare = 50 + (distance * 12);

            fare += Math.max(0, waiting - 5) * 2;

            double discount = (premium && fare > 300)
                    ? fare * 0.10 : 0;

            fare -= discount;

            System.out.printf("Final fare: Rs. %.2f%n", fare);
        }

        sc.close();
    }
}