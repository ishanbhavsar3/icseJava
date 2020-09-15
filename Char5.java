public class Char5
{
    public static void main()
    {
        char a = 'C';
        char b = 'f';
        
        System.out.println("Before converting; ");
        
        System.out.println(a);
        System.out.println(b);
        
        int d = (int)a+32;
        a = (char)d;
        
        int e = (int)b-32;
        b = (char)e;
        
        System.out.println("After converting; ");
        
        System.out.println(a);
        System.out.println(b);
        
    }
}