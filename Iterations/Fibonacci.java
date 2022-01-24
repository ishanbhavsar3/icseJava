import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of terms of Fibonacci series you want.");
        int n = sc.nextInt();
        int n1 = 0; int n2 = 1;       
        System.out.println("First " + n + " terms of Fibonacci series: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(n1+" ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    } // 0 1 1 2 3 5 8 13 ....
} // (c) 2022 Ishan Ketan Bhavsar
