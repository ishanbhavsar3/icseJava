import java.util.Scanner;
public class ArrMaxInput
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        int len=arr.length;
        int max=arr[0];

        System.out.println("Enter elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(i=0;i<len;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

        System.out.println("Largest Element : "+max);
    }
}