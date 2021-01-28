 import java.util.Scanner;
public class Buzz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%10==7 || a%7==0)
        {
            System.out.println("Buzz Number.");
        }
        else
        {
            System.out.println("Not a Buzz Number.");
        }
    }
}