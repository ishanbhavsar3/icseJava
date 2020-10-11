import java.util.Scanner;
public class assgn
{
    public void main()
    {
        Scanner a = new Scanner(System.in);
        long b = a.nextLong();
        long ult = b % 10;
        System.out.println("The last digit of the number "+b+" = "+ult);
        System.out.println("The last two digits of the number "+b+" = "+(b%100));
        long p_ult = (b/10)%10;
        System.out.println("Sum of last two digits of number "+b+" = "+(long)(ult+p_ult));
        
    }
}