public class PerDiff
{
    public static void main()
    {
        int OrgNum = 80;
        int NewNum = 90;
        int inc = NewNum - OrgNum;
        double p = inc / (double)OrgNum*100;
        System.out.println("Percentage Difference = "+p+" %");
    }
}