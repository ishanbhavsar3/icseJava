public class Swap
{
    public static void main()
    {
        int a, b, y;
        a = 10;
        b = 5;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("After swapping,...");
        y = a;
        a = b;
        b = y;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    void interchange(int a , int b)
    {
        int x;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("After swapping,...");
        x = a;
        a = b;
        b = x;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}