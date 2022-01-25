// 1 12 123 1234 12345 123456 1234567 12345678 123456789 
import java.util.Scanner;
public class Series1
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter numbers for series.");
            int n = sc.nextInt();
            int s = 0, i;
            for(i = 1; i<=n; i++)
            {
                s = s*10+i;
                System.out.print(s+" ");
            }
    }
}
