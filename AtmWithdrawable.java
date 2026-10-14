import java.util.Scanner;

public class AtmWithdrawable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount > 0 && amount % 100 == 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction Failed");
        }

        sc.close();
    }
}