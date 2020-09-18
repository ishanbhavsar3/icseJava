public class ScopeVar
{
    public static void main()
    {
        {
            int b = 5;
            {
                int a = 12;
                System.out.println("Value of b is "+b);
                System.out.println("Value of a is "+a);
            }// end of inner scope
            System.out.println("Value of b is "+b);
            //System.out.println("Value of a is "+a);
        }//end of outer scope
    }//end of function
}//end of class

