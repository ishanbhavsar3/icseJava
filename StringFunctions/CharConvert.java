import java.util.Scanner;
public class CharConvert 
{
    public static void main() 
    {
        String str, up, change = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        str = sc.nextLine(); up = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = up.charAt(i);
            if (ch == ' ') 
                change += ' ';
             else 
            {
                if (ch == 'Y')
                    ch = 'A';
                else if (ch == 'Z')
                    ch = 'B';
                else
                    ch += 2; 
                    change += ch;
            }
        }
        System.out.println("Entered string = " + str);
        System.out.println("Uppercase string = " + up);
        System.out.println("Converted string = " + change);
    }
}