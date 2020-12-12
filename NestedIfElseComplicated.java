public class NestedIfElseComplicated
{
    public static void main(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("Greatest Number = "+a);
            }
            else
            {
                System.out.println("Greatest Number = "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("Greatest Number = "+b);
            }
            else
            {
                System.out.println("Greatest Number = "+c);
            }   
        }
    }
}