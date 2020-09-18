public class Time
{
    public static void main()
    {
        int seconds = 3750;
        int second = seconds % 60;
        int hour = seconds / 60;
        int minutes = hour % 60;
        hour = hour / 60;
        System.out.print( hour + " hour " + minutes + " minutes " + second + " seconds ");
    }
}