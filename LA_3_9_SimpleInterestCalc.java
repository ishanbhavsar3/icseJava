public class LA_3_9_SimpleInterestCalc
{
    public static void main(double p, double r,double t)
    {
        System.out.println("The Principal amount is "+p);
        System.out.println("The Rate of Interest is "+r);
        System.out.println("The time is "+t);
        System.out.println("The Simple Interest for "+t+" years is Rs."+(p*r*t)/100);
    }
}