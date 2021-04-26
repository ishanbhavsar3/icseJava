import java.util.Scanner;
public class Series2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        double sum = 0;
        
        for(int i = 1; i<=n; i++)
        {
            double term = Math.pow(x,i);
            if(i%2==0)
            {
                sum = sum - term;
                System.out.println("Sum = "+sum);
            }
            else
            {
                sum = sum + term;
                System.out.println("Sum = "+sum);
            }
        }
    }
}