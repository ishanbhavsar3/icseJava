public class M3Chap4
{
    public static void main()
    {
        System.out.println("Conditional Operator");
        
        int x2 = 5 > 7 ? 5 : 7;
        System.out.println("x = "+x2);
        
        int y2 = 5 < 7 ? 5: 7;
        System.out.println("y = "+y2);
        
        System.out.println("Assignment Operator");
        int p = 10;
        p += 3;
        System.out.println(p);
        
        int a = 16;
        a -= 5;
        System.out.println(a);
        
        int b = 8;
        b *= 2;
        System.out.println(b);
        
        a = 10;
        a /= 2;
        System.out.println(a);
        
        p = 17;
        p %= 2;
        System.out.println(p);
        
        System.out.println("Precedence of Operators Multiplication");
        
        int a3 = 5+3*2;
        System.out.println("a3  = "+a3);
        
        int a4 = 5*(13-(20/4))-2;
        System.out.println("a4 = "+a4);
        
         double Pncpl, t, r, SI;
        Pncpl = 45000.0; t = 7.0; r = 7.0;
        
        SI = (Pncpl*r*t)/100;
        
        System.out.println("Amount = "+SI);
        
    }
}
