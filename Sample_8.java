public class Sample_8
{
    public static void main()
    {
        int a = 100; int i;
        long b = a;
        double c = 200.04;
        i = (int)c;
        System.out.println(i);
        i = (int)c - (int)b;
        System.out.println(i);
    }
}