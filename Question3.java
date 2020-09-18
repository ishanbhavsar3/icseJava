public class Question3
{
    public static void main()
    {
        int y = 4;
        int x = y++ + ++y + y;
        System.out.println("x= "+x);
    }
}