import java.util.Scanner;
public class Evenrange{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=sc.nextInt();
        if((num%2==0)&&(num>10))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}