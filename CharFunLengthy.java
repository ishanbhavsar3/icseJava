import java.util.Scanner;
public class CharFunLengthy
{
    public static void main()
    {
        System.out.println("Input 5 characters.");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        char e = sc.next().charAt(0);
        if(Character.isLetterOrDigit(a))
        {
            if(Character.isDigit(a))
            {
                System.out.println("The ASCII value of "+a+" is "+(int)a);
            }
            if(Character.isLetter(a))
            {
                if(Character.isUpperCase(a))
                {
                    System.out.println(a+" is an uppercase character");
                }
                else if(Character.isLowerCase(a))
                {
                    System.out.println(a+" is a lowercase character");
                }
            }
        }
        if(Character.isLetterOrDigit(b))
        {
            if(Character.isDigit(b))
            {
                System.out.println("The ASCII value of "+b+" is "+(int)b);
            }
            if(Character.isLetter(b))
            {
                if(Character.isUpperCase(b))
                {
                    System.out.println(b+" is an uppercase character");
                }
                else if(Character.isLowerCase(b))
                {
                    System.out.println(b+" is a lowercase character");
                }
            }
        }
        if(Character.isLetterOrDigit(c))
        {
            if(Character.isDigit(c))
            {
                System.out.println("The ASCII value of "+c+" is "+(int)c);
            }
            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                {
                    System.out.println(c+" is an uppercase character");
                }
                else if(Character.isLowerCase(c))
                {
                    System.out.println(c+" is a lowercase character");
                }
            }
        }
        if(Character.isLetterOrDigit(d))
        {
            if(Character.isDigit(d))
            {
                System.out.println("The ASCII value of "+d+" is "+(int)d);
            }
            if(Character.isLetter(d))
            {
                if(Character.isUpperCase(d))
                {
                    System.out.println(d+" is an uppercase character");
                }
                else if(Character.isLowerCase(d))
                {
                    System.out.println(d+" is a lowercase character");
                }
            }
        }
        if(Character.isLetterOrDigit(e))
        {
            if(Character.isDigit(e))
            {
                System.out.println("The ASCII value of "+e+" is "+(int)e);
            }
            if(Character.isLetter(e))
            {
                if(Character.isUpperCase(e))
                {
                    System.out.println(e+" is an uppercase character");
                }
                else if(Character.isLowerCase(e))
                {
                    System.out.println(e+" is a lowercase character");
                }
            }
        }
    }
}