//Pattern : 1 11 111 1111 11111 111111 1111111 11111111 111111111 1111111111 ....
import java.util.Scanner;
public class TenMultiplyPO
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int s = 0, c;                                          
        for (c = 1; c <= n; c++)                          
        {
            s = s * 10 + 1;
            System.out.print(s + " ");
        }                                                           
    }
}
