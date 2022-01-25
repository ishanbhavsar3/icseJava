
import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to check if it is prime.");
        int num = sc.nextInt();
        
        boolean isPrime = true;
        
        for(int i = 2; i<num; i++)
        {
            if(num%i==0)
            {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime)
        {
            System.out.println(num + " is a Prime number");
        }
        else
        {
            System.out.println("No, "+num+" is not a Prime number.");
        }
    }
}
