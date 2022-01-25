import java.util.Scanner;
public class CharFunLoop
{
    public static void main(String[] args)
    {
        for(int i = 1; i<=5; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a character.");
            char ch = sc.next().charAt(0);
            if(Character.isLetterOrDigit(ch))
            {
                if(Character.isDigit(ch))
                {
                    System.out.println("The ASCII value of "+ch+" is "+(int)ch);
                }
                if(Character.isLetter(ch))
                {
                    if(Character.isUpperCase(ch))
                    {
                        System.out.println(ch+" is an uppercase character");
                    }
                    else if(Character.isLowerCase(ch))
                    {
                        System.out.println(ch+" is a lowercase character");
                    }
                }
            }
        }
    }
}
