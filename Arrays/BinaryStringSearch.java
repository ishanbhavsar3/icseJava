import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string array of what length you wish to input.");
        int n = sc.nextInt();
        String[] a = new String[n];
        System.out.println("Input "+n+" words into the string, make sure the string input is sorted.");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }
        System.out.println("\nInput the word you wish to search for in your array.");
        String search = sc.next();
        int li = 0, hi = a.length-1, mi = (li + hi)/2, found = 0, pos = -1;
        while (li<=hi) {
            mi = li + (hi-li)/2;
            if (a[mi].compareTo(search)==0)
            {
                found = 1; pos = mi+1;
                System.out.println("Element "+search+" is found at index "+mi+" and position "+pos);
                break;
            }
            else if (a[mi].compareTo(search)<0)
            {
                li = mi+1;
            }
            else if (a[mi].compareTo(search)>0)
            {
                hi = mi-1;
            }
        }
        if (found!=1)
        {
            System.out.println("Element "+search+" not found in the array.");
        }
    }
}
