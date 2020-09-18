public class Person
{
    public static void main()
    {
        int paid = 350;
        int fined = 30;
        int paid_days = 25;
        int fined_days = 5;
        int income = (paid*paid_days)-(fined*fined_days);
        System.out.println("Monthly income = "+income);
    }
}