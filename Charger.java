import java.util.Scanner;
public class Charger {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        String status=((battery<90)&&(temp>10&&temp<45))?"charging allowed":"charging not allowed";
       System.out.println(status);
       if(status.equalsIgnoreCase("charging allowed")){
       System.out.println(battery+5);
       }
    }
        }
