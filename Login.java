import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum attempts: ");
        int max = sc.nextInt();

        System.out.print("Enter failed attempts: ");
        int failed = sc.nextInt();

        if (failed < max) {
            System.out.println("Login Attempt Allowed");

            failed++;

            System.out.println(failed < max 
                    ? "Next Attempt Allowed"
                    : "Account Locked");
        } else {
            System.out.println("Account Locked");
        }

        sc.close();
    }
}