public class Time
{
    public static void main(String[] args)
    {
        // Question : Express 3750 seconds in hours, minutes and seconds.
        int seconds = 3750;
        int second = seconds % 60;
        int hour = seconds / 60;
        int minutes = hour % 60;
        hour = hour / 60;
        System.out.print( hour + " hours " + minutes + " minutes " + second + " seconds ");
    }
}
