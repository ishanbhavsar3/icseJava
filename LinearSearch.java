import java.util.*;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Input ten elements into the array.");
        for(int i = 0; i <arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Displaying the elements of the array: ");
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int elem, index = 0, found = 0;
        System.out.println("\nEnter the element to be searched: ");
        elem = sc.nextInt();
        for(int i = 0; i<arr.length; i++)
        {
            if(elem==arr[i])
            {
                index = i;
                found = 1;
            }
        }
        if(found == 1)
        {
            System.out.println("Array element found at index "+index+" and the position of the element is at "+(index+1));
        }
        else
        {
            System.out.println("Array element not found");
        }
    }
}