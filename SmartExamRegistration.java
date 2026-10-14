import java.util.Scanner;

public class SmartExamRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        System.out.print("Medical certificate approved? (true/false): ");
        boolean medical = sc.nextBoolean();

        System.out.print("Examination fee paid? (true/false): ");
        boolean feePaid = sc.nextBoolean();

        System.out.print("All assignments submitted? (true/false): ");
        boolean assignments = sc.nextBoolean();

        String result = ((attendance >= 75 || (attendance >= 65 && medical))
                && feePaid && assignments)
                ? "Registration Successful" : "Registration Rejected";

        System.out.println(result);

        sc.close();
    }
}