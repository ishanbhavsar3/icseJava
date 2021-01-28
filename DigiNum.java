import java.util.Scanner;
public class DigiNum
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number from 0 to 999 to find if it is 1 digit, 2 digit or 3 digit.");
        int n = sc.nextInt();
        if(n>=0 && n<=9)
        {
            System.out.println("The number "+n+" is one digited.");
        }
        else if(n>=10 && n<=99)
        {
            System.out.println("The number "+n+" is two digited.");
        }
        else if(n>=100 && n<=999)
        {
            System.out.println("The number "+n+" is three digited");
        }
        else
        {
            System.out.println("Please input only one to or three digit positive numbers.");
        }
    }
}