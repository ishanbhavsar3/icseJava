import java.util.Scanner;
public class ArrayAsgn1
{
    public static void main(String[] args) 
    {
        int[] a = new int[20];
        int es = 0, os = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 20 elements into the array.");
        for(int i = 0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int j = 0; j<a.length; j++)
        {
            System.out.print(a[j]+" ");
            if(a[j] % 2 ==0 )
            {
                es += a[j];
            }
            else
            {
                os += a[j];
            }
        }
        System.out.println("Sum of elements at odd indexes: "+os);
        System.out.println("Sum of elements at even indexes: "+es);
    }
}
