import java.util.Scanner;

public class Neon
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to check if it is neon or not.");
        int inp = sc.nextInt();
        int sqr = inp*inp;
        int digi1 = sqr/10;
        int digi2 = sqr%10;
        if(inp > 0)
        {
            if(inp == (digi1+digi2))
            {
                System.out.println(inp + " is a Neon number");
            }
            else
            {
                System.out.println("Not neon");
            }
        }
    }
}
