import java.util.Scanner;
public class PosNeg
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to check if number is positive or negative.");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("The number "+n+" is positive.");
        }
        else if(n==0)
        {
            System.out.println("The number "+n+" is neither positive nor negative.");
        }
        else
        {
            System.out.println("The number "+n+" is negative.");
        }
    }
    public static void mai()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to check if number is positive or negative.");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("The number "+n+" is positive.");
        }
        if(n<0)
        {
            System.out.println("The number "+n+" is negative.");
        }
    }
}