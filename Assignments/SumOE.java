// Calculates the sum of odd numbers and even numbers differently upto a certain integer 'n'
import java.util.Scanner;
public class SumOE
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till which you want sum of odd and even numbers.");
        int n = sc.nextInt();
        int even = 0, odd = 0;
        for(int i = 1; i<=n;i++)
        {
            System.out.print(i+" ");
            if(i%2==0)
            {
                even += i;
            }
            else
            {
                odd = odd + i;
            }
        }
        
        System.out.println("Sum of even numbers = "+even);
        System.out.println("Sum of odd numbers = "+odd);
    }
}
