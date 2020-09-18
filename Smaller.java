public class Smaller
{
    void small(int a,int b)
    {
        int c = a > b ? a : b ;
        System.out.println(c);
    }
    public static void main(int c,int d)
    {
        Smaller obj1 = new Smaller();
        obj1.small(c,d);
    }
}