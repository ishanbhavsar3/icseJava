public class Patternb
{
    public static void main()
    {
        for(int i = 1; i<=4; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    public static void main_()
    {
        for(char i = 'A'; i<='D'; i++)
        {
            for(char j = 'A'; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void m()
    {
        for(char i = 'A'; i<='D'; i++)
        {
            for(char j = 'A'; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}