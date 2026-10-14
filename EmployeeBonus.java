import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter performance score: ");
        int score = sc.nextInt();

        System.out.print("Enter completed projects: ");
        int projects = sc.nextInt();

        int bonus = (score >= 90 && projects >= 3) ? 15
                  : (score >= 75 || projects >= 5) ? 10
                  : (score >= 60) ? 3 : 0;

        double finalSalary = salary + (salary * bonus / 100);

        System.out.println("Bonus: " + bonus + "%");
        System.out.println("Final Salary: Rs. " + finalSalary);

        sc.close();
    }
}