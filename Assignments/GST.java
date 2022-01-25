public class GST
{
    public static void main(double b,char a)
    {
        switch(a)
        {
            case 'a':
            System.out.println("IGST = 5%");
            System.out.println("Final cost = Rs."+Math.round((b+((5*b)/100))));
            break;
            case 'b':
            System.out.println("SGST = 2.5% , CGST = 2.5%");
            System.out.println("SGST = Rs."+Math.round((((2.5*b)/100))));
            System.out.println("CGST = Rs."+Math.round((((2.5*b)/100))));
            System.out.println("Final cost = Rs."+Math.round((b+((5*b)/100))));
            break;
        }
    }
}
