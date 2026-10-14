import java.util.Scanner;
public class Inventorychecker {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter current stock : ");
        int current = sc.nextInt();

        System.out.print("Enter incomming stock: ");
        int incomming = sc.nextInt();
        System.out.print("Enter minimum  stock: ");
        int minimum = sc.nextInt();
        current+=incomming;
        String record=(minimum>current)?"record required":"stock sufficient";
        System.out.println(record);
    }
}