import java.util.*;
public class ArrayAsgn5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("Input twenty elements into the array.");
        for(int i = 0; i <arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Displaying the elements of the array: ");
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int num, index = 0, found = 0;
        System.out.println("\nEnter the element to be searched: ");
        num = sc.nextInt();
        for(int i = 0; i<arr.length; i++)
        {
            if(num==arr[i])
            {
                index = i;
                found = 1;
            }
        }
        if(found == 1)
        {
            System.out.println("Array element "+num+" found at index "+index);
        }
        else
        {
            System.out.println("Array element not found");
        }
    }
}