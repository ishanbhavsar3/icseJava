import java.util.Scanner;
public class SDAF2C
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double arr[] = new double[20];

        System.out.println("Enter 20 temperatures in degree Fahrenheit");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Temperatures in celsius: ");
        for(int i = 0; i< arr.length; i++)
        {
            double tc = (5 * (arr[i] - 32)) / 9;
            System.out.println(tc);
        }
    }
}
