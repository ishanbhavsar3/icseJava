public class Calc2
{
    public static void main()
    {
        int a,b,c,num,den,exp;
        a = 5;
        b = 4;
        c = 3;
        num = a*a+b*b+c*c;
        den = a*b*c;
        exp = num/den;
        System.out.println(exp);
    }
}