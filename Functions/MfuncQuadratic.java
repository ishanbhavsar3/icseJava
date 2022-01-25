import java.util.*;
public class MfuncQuadratic
{
    public static void main(String[] args)
    {
        System.out.println("Input a b and c of a Quadratic equations to find its roots.");
        Scanner obj = new Scanner(System.in);
        double a = obj.nextDouble();
        double b = obj.nextDouble();
        double c = obj.nextDouble();
        
        double num = -b + (Math.sqrt((Math.pow(b,2)-4*a*c)));
        double den = 2*a;
        System.out.println(num/den);
    }
}
