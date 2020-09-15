public class ArithmeticOperators
{
    public static void main()
    {
        int a, b, c, d, proi;
        a = 2; b = 3; c= 4; d = 5;
        float e, f;
        e = 1.2f; f = 2.2f;
        System.out.println(a+b);
        System.out.println(f-e);
        System.out.println(a/d);
        System.out.println(b%c);
        proi = a*b*c*d;
        double prof = e*f;
        System.out.println("Product of int = "+proi);
        System.out.println("Product of float = "+prof);
    }
}