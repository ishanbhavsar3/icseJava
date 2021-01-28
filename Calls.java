import java.util.Scanner;
public class Calls
{
    public static void main()
    {
        double pr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of calls made by you this month to get your bill amount.");
        int cl = sc.nextInt();
        if(cl<=100)
        {
            System.out.println("Your bill amount is Rs.500.");
        }
        else if(cl>100 && cl<=200)
        {
            pr = (1.10*cl)+500;
            System.out.println("Your bill amount is Rs."+pr);
        }
        else if(cl>200 && cl<=300)
        {
            pr = (1.25*cl)+500;
            System.out.println("Your bill amount is Rs."+pr);
        }
        else if (cl>300)
        {
            pr = (1.35*cl)+500;
            System.out.println("Your bill amount is Rs."+pr);
        }
        else
            System.out.println("Please input only a whole number as number of calls");    
    }
}