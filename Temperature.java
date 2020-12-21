import java.util.Scanner;
public class Temperature 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        double celsius = 5 * (fahrenheit-32) / 9;
        System.out.println("Temperature in celsius: "+celsius);
    }
}
