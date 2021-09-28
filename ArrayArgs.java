import java.util.Scanner;
public class ArrayArgs 
{
    public static int add(int[] a)
    {
        int sum = 0;
        for(int j = 0; j<a.length; j++)
        {
            sum = sum+a[j];
        }
        return sum;

    }
    public static void main() 
    {
        int[] inp = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 5 elements into the array: ");
        for(int i = 0; i<inp.length; i++)
        {
            inp[i] = sc.nextInt();
        }
        int answer = add(inp);
        System.out.println("The sum of the 5 elements of the array is "+answer);
    }
}
