public class SwapKG
{
    public static void main()
    {
        int a = 10; int b = 5;
        System.out.println(a);
        System.out.println(b);
        {
            a = b;
            System.out.println("a = "+a);
        }
        {
            b = a;
            System.out.println("b = "+b);
        }
    }
    public static void sub()
    {
        int a,b,c;
        a = 10;
        b= 5;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        c = a;
    }
    }
