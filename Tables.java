import java.util.Scanner;
public class Tables
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number whose table you want.");
        long a = sc.nextLong();
        System.out.println("Input till what number you want the table.");
        long b = sc.nextLong();

        for(long c = 0; c<=b; c++)
        {
            System.out.println();
            System.out.println(a+"*"+c+"="+ (a*c));
        }
    }
}
