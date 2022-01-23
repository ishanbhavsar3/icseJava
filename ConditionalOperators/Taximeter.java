import java.util.Scanner;
public class Taximeter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name.");
        String name = sc.nextLine();
        System.out.println("Input kilometers travelled.");
        int km = sc.nextInt();
        if(km<=5 && km>=1)
        {
            System.out.println("Hello "+name+" ! The distance you travelled is "+km+" kilometer(s)");
            System.out.println("The rate per kilometer is Rs.25 and total cost is Rs."+km*25);
        }
        else if(km<=6 && km>=10)
        {
            System.out.println("Hello "+name+" ! The distance you travelled is "+km+" kilometer(s)");
            System.out.println("The rate per kilometer is Rs.30 and total cost is Rs."+km*30);
        }
        else if(km>10)
        {
            System.out.println("Hello "+name+" ! The distance you travelled is "+km+" kilometer(s)");
            System.out.println("The rate per kilometer is Rs.40 and total cost is Rs."+km*40);
        }
        else
        {
            System.out.println("Hello "+name+" !");
            System.out.println("Enter only within the range of 1 and 40 kilometers.");
        }
    }
}
