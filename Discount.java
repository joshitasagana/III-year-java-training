import java.util.Scanner;
public class Discount{
    public static void main(String []args){
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the purchase amount:");
        int amount=s1.nextInt();
        System.out.println("enter the membership status yes or no:");
         String membership=s1.next();
if((amount>=2000)||(membership.equalsIgnoreCase("yes")))
{
System.out.println("discount");
}else{
    System.out.println("no discount");
}
s1.close();
    }
}