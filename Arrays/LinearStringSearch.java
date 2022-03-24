import java.util.Arrays;
import java.util.Scanner;

public class LinearStringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0, found = 0;
        System.out.println("'Input string array of what length you wish to input.");
        int n = sc.nextInt();
        String[] a = new String[n];
        System.out.println("Input "+n+" words into the string.");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }
        Arrays.sort(a);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nInput the word you wish to search for in your array.");
        String search = sc.next();
        for (int i = 0; i < a.length; i++) {
            if (search.equalsIgnoreCase(a[i])) {
                index = i;
                found = 1;
                break;
            }
        }
        if (found==1) {
            System.out.println("Element "+search+" was found at index "+index+" at place "+(index+1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}

