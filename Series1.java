import java.util.Scanner;
public class Series1
{
    public static void main()
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("ENter numbers ");
            int n = sc.nextInt();
            int s = 0, i;
            for(i = 1; i<=n; i++)
            {
                s = s*10+i;
                System.out.print(s+" ");
            }
    }
}