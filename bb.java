public class bb
{
    public static void main()
    {
        int a = 12;
        int b = 26;
        int c = a++ + --b - ++a;
        System.out.println(a);
        System.out.println(c);
    }
}