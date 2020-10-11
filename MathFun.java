public class MathFun
{
    public static void  main()
    {
        int a = 25;
        int b = 3;
        
        double sq_ , pow;
        sq_ = Math.sqrt(a);
        pow = Math.pow(a,b);
        System.out.println("Square root of 25 = "+sq_);
        System.out.println("Twenty-five raised to three = "+pow);
        
        double s1,s2,s3,x,y,z;
        s1 = Math.floor(145.65);
        s2 = Math.ceil(-6.35);
        s3 = Math.round(11.49999);
        x = Math.floor(Math.round(31.5044));
        y = 27.9;
        System.out.println(Math.cbrt(Math.floor(y)));
        z = Math.pow(3, Math.sqrt(0));
        System.out.println(z);
        System.out.println("Floor for the number 145.65 = "+s1);
        System.out.println("Ceiling for the number 145.65 = "+s2);
        System.out.println(s3);
        System.out.println(x);
    }
}