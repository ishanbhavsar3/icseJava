import java.util.Scanner;
public class Array_4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char alpha[] = new char[26];
        for(int i = 65 , j = 0; i<=90; i++, j++)
        {
            alpha[j] = (char)i;
        }
        for(int i = 0; i<alpha.length; i++)
        {
            System.out.print(alpha[i]+"\t");
        }
        int ascii[] = new int[26];
        for(int i = 65, j = 0; i <=90; i++, j++)
        {
            ascii[j] = i;
            System.out.print(ascii[j]+"\t");
        }
        System.out.println();
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        int li = 0, hi = (alpha.length-1), mi = (li+hi)/2, found = 0;
        while(li<=hi)
        {
            mi = (li + hi)/2;
            if(alpha[mi]==ch)
            {
                System.out.println("Element is found at "+mi);
                System.out.println("ASCII code of the character is "+ascii[mi]);
                found = 1;
                break;
            }
            else if(alpha[mi]<ch)
            {
                li = mi + 1;
            }
            else if(alpha[mi]>ch)
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