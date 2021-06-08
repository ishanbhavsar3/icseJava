import java.util.Scanner;
public class Employee
{
    public static void main()
    {
        System.out.println("Input the salary of a employee.");
        Scanner obj = new Scanner(System.in);
        long sal = obj.nextLong();
        System.out.println("Input number of days he worked extra.");
        double days = obj.nextDouble();
        System.out.println("Input the rate per day of the employee.");
        double rate = obj.nextDouble();
        double wages = sal+(days*rate);
        System.out.println("The salary of the employee = Rs."+sal);
        System.out.println("Number of days extra work was done by him = "+days);
        System.out.println("The rate per day of the employee = Rs."+rate);
        System.out.println("The amount to be paid to the employee as wages = "+wages);
    }
}