public class NewSwap
{
    public static void main()
    {
        char m = 'a';
        char n = 'b';
        char x;
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        System.out.println("After swapping");
        x = m;
        m = n;
        n = x;
        System.out.println("m = "+m);
        System.out.println("n = "+n);
    }
}