import java.util.Scanner;

public class SecureTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter transfer amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter daily limit: ");
        double limit = sc.nextDouble();

        System.out.print("Is account active? (true/false): ");
        boolean active = sc.nextBoolean();

        if (amount > 0 && amount <= balance && amount <= limit && active) {
            balance -= amount;
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Transaction Failed");
        }

        System.out.println("Remaining Balance: Rs. " + balance);

        sc.close();
    }
}