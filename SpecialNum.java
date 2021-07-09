import java.util.Scanner;

public class SpecialNum
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if special or not.");
        int inp = sc.nextInt();
        int fac, j, safe = inp; int sum = 0;
        while(safe!=0) {
            j = safe%10;
            fac = 1;
            for(int i = 1; i<=j; i++)
            {
                fac*=i;
            }
            sum+=fac;
            safe/=10;
        }
        if(sum==inp)
            System.out.println(inp+" is a special number.");
    }
}