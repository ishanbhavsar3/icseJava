import java.util.*;
public class Hyp 
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input the base of right angle triangle.");
        double b = obj.nextDouble();
        System.out.println("Input the perpendicular of right angle triangle.");
        double p = obj.nextDouble();
        double sum_S = (Math.pow(p,2)+Math.pow(b,2));
        double sqrt_ = Math.sqrt(sum_S);
        System.out.println("The hypotenuse of triangle having base as "+b+" units and perpendicular as "+p+" units = "+sqrt_+" units.");
    }
}