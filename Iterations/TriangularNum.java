import java.util.Scanner;
public class TriangularNum
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to check if triangular: ");
        int n = in.nextInt();
        int sum = 0, found = 0;
        for(int i = 1; i<=n; i++)
        {
            sum = sum + i;
            if(sum==n)
            {
                found = 1;
                break;
            }
        }
        if(found == 1)
        {
            System.out.println("The number "+n+" is triangular.");
        }
        else
        {
            System.out.println("The number is not triangular.");
        }
    }
}
