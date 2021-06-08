public class IfElseIf2
{
    public static void main(int a, int b, int c)
    {
        if(a>b&&a>c)
            System.out.println("a is the greatest of the three numbers.");
        else if(b>c&&b>a)
            System.out.println("b is the greatest of the three numbers.");
        else if(c>b&&c>a)
            System.out.println("c is the greatest of the three numbers.");
        if(a>b)
        {
            if(a>c)
                System.out.println("Greatest Number = a = "+a);
            else
                System.out.println("Greatest Number = c = "+c);
        }
        else
        {
            if(b>c)
                System.out.println("Greatest Number = b = "+b);
            else
                System.out.println("Greatest Number = c = "+c);  
        }
    }
}