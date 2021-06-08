import java.util.*;
public class Index
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        long a = obj.nextLong();
        int last,first;
        last = (int)a%10;
        first = (int)a/100;
        long sum = first+last;
        long pro = first*last;
        System.out.println("The sum of the first and last digit is "+sum);
        System.out.println("The product of the first and last digit is "+pro);
    }
}