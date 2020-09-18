public class LA_3_7
{
    public static void main()
    {
        double a = 25.0;
        double i;
        for(i = 1; i <= a; i++)
        {
            if(i*i == a)
            {
                System.out.println("The square root of the number "+a+" is "+i);
                break;
            }
        }
        double b = 16.0;
        for(i = 1; i <= b; i++)
        {
            if(i*i == b)
            {
                System.out.println("The square root of the number "+b+" is "+i);
                break;
            }
        }
    }
}