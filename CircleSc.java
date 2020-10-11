import java.util.Scanner;
public class CircleSc
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of a circle.");
        double r = sc.nextDouble();
        final double pi = 3.14;
        
        double A = pi*(Math.pow(r,2));
        double C = 2*pi*r;
        
        System.out.println("Area of the circle = "+A+" units.");
        System.out.println("Circumference or perimeter of the circle = "+C+" units.");
    }
}