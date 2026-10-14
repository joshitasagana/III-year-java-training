import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        double totalSalary = basic + bonus;

        System.out.println("Employee Name: " + name);
        System.out.printf("Total Salary: Rs. %.2f%n", totalSalary);

        sc.close();
    }
}