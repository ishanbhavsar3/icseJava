public class Demo2 
{
    public static void main()
    {
        int m = 4;
        int n = 18;
        
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        
        System.out.println("After Swaping;");
        
        m = m+n;
        n = m-n;
        m = m-n;
        
        System.out.println("m = "+m);
        System.out.println("n = "+n);
    }
}