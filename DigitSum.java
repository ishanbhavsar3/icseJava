import java.util.Scanner;
class DigitSum
{
    public static void main(String[] args)
    {
        int i,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        i=sc.nextInt();
        for(sum=0 ;i!=0 ;i/=10)
        {
            sum+=i%10;
        }
        System.out.println("Sum of digits "+sum);
    }
}
