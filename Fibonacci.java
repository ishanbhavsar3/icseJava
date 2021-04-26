public class Fibonacci 
{

    public static void main() 
    {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.println(n1);

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}