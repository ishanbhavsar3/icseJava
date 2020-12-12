public class SwitchDays
{
public static void main(int days)
{
    switch(days)
    {
        case 7:
        System.out.println("Sunday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 1:
        System.out.println("Monday");
        break;
        default:
        System.out.println("Invalid_num_input");
        break;
    }
}
}