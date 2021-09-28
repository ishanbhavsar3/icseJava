import java.util.*;
public class AROE
{
    void src()
    {
        Scanner sc = new Scanner(System.in);
        int[] one = new int[10];
        int i;
        int se = 0;
        int so = 0;
        System.out.println("Input 10 numbers.");
        for (i=0; i<10; i++)
            one[i] = sc.nextInt();
        for (i=0; i<10; i++)
        {
            if(one[i]%2==0) {
                se += one[i];
            } else {
                so += one[i];
            }
        }
        System.out.println("Sum of odd numbers = "+so);
        System.out.println("Sum of even numbers = "+se);
    }
    public static void main()
    {
        AROE call = new AROE();
        call.src();
    }
}