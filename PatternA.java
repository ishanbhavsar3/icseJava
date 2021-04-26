public class PatternA
{
    public static void main()
    {
        for(int i = 4; i>=1; i--)
        {
            for(int j = 1; j<=4 && j>=1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}