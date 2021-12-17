import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int a[] = {12, 15, 19, 25, 36, 45, 49, 60, 72, 81, 99};
        System.out.println("The array elements are: \n");
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the element you wish to search in the array.");
        int search = sc.nextInt();
        int li = 0, hi = (a.length - 1), mi = (li+hi)/2, found = 0;
        while(li<=hi)
        {
            mi = (li + hi)/2;
            if(a[mi]==search)
            {
                System.out.println("Element is found at "+mi);
                found = 1;
                break;
            }
            else if(a[mi]<search)
            {
                li = mi + 1;
            }
            else if(a[mi]>search)
            {
                hi = mi - 1;
            }
        }        
        if(found != 1)
        {
            System.out.println("Element not found");
        }
    }
}
