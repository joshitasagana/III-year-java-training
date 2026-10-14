import java.util.Scanner;
public class Passdetector{
    public static void main(String []args){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the mark:");
        int mark=s1.nextInt();
        System.out.println("enter the attendance:");
         int attendance=s1.nextInt();
String result=((mark>=40)&&(attendance>=75))?"pass":"fail";
System.out.println(result);
s1.close();
    }
}