import java.util.*;
public class ArraySearchVowCon
{
    public static void main(String[] args)
    {
        byte cc = 0, vowels = 0;
        Scanner sc = new Scanner(System.in);
        char[] alpha = new char[10];
        System.out.println("Input ten character elements into the array.");
        for(int i = 0; i <alpha.length; i++)
        {
            alpha[i] = sc.next().charAt(0);
        }
        System.out.println("Displaying the elements of the array: ");
        for (int i = 0; i<alpha.length; i++)
        {
            System.out.print(alpha[i] + "\t");
            char a = Character.toUpperCase(alpha[i]);
            if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')
                vowels++;
            else if(Character.isLetter(a))
                cc++;
        }
        System.out.print("\nVowels in the array  = "+vowels+
        "\nConsonants in the array = "+cc);
        System.out.println("\nEnter the element you wish to search in the array.");
        int search = sc.next().charAt(0);
        int li = 0, hi = (alpha.length - 1), mi = (li+hi)/2, found = 0;
        while(li<=hi)
        {
            mi = (li + hi)/2;
            if(alpha[mi]==search)
            {
                System.out.println("Element is found at "+mi);
                found = 1;
                break;
            }
            else if(alpha[mi]<search)
            {
                li = mi + 1;
            }
            else if(alpha[mi]>search)
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
