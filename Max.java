public class Max
{
    public static void main()
    {
        double a = 12;
        double b = 13;
        double c = 14;
        
        double d = Math.max(Math.max(a,b) , c);
        System.out.println(d);
    }
}