public class CI_
{
    public static void main()
    {
        int p,r,t;
        p = 5000;
        r = 5;
        t = 3;
        
        double SI1=(p*r*1)/100.0;
        System.out.println("Interest for the first year ="+SI1);


        double SI2=((p+SI1)*5.0*1)/100.0;
        System.out.println("Interest for the second year ="+SI2);


        double SI3=((SI1+SI2+p)*5.0*1)/100;

        double A3=SI1+SI2+SI3+p;

        System.out.println("Amount after three years ="+A3);
    }
}