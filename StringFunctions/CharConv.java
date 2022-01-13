import java.util.Scanner;
public class CharConv
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str, up, change = ""; char ch;
        System.out.println("Enter a sentence ");
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) 
        {
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                ch+=1;
            }
            change+=ch;
        }
        System.out.println(change);
    }
}
