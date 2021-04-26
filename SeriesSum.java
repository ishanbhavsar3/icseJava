import java.util.Scanner;
public class SeriesSum
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        for(int i = 1, j = 3; i<=20; i++,j+=2)
        {
            sum += Math.pow(2,i)/j;
        }
        System.out.println("Sum = "+sum);
    }
    public static void m()
    {
        for(int i = 2; i <= 11; i++)
        {
            System.out.print((i*i + 1)+" ");
        }
    }
    public static void mn()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms.");
        int n = sc.nextInt();
        int s = 0, x;
        for(x=1;x<=n;x++)
        {
            s = s*10 +x;
            System.out.print(s+ " ");
        }
    }
}