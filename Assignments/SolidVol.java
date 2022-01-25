import java.util.Scanner;
public class SolidVol
{
    public static void main(String[] args)
    {
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1 for finding volume of cuboid.");
        System.out.println("Input 2 for finding volume of cylinder.");
        System.out.println("Input 3 for finding volume of cone.");
        int s = sc.nextInt();
        switch(s)
        {
            case 1:
            System.out.println("Input length, breadth and height of cuboid respectively.");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println("The volume of the cuboid is "+(l*b*h)+" cube units.");
            break;
            
            case 2:
            System.out.println("Input height of cylinder.");
            double hc = sc.nextDouble();
            System.out.println("Input radius of cylinder.");
            double r = sc.nextDouble();
            double vc = pi*Math.pow(r,2)*hc;
            System.out.println("Volume of cylinder = "+vc+" cube units.");
            break;
            
            case 3:
            System.out.println("Input height of cone.");
            double hcn = sc.nextDouble();
            System.out.println("Input height of cone.");
            double rcn = sc.nextDouble();
            double vcn = (1*pi*Math.pow(rcn,2)*hcn)/3;
            System.out.println("Volume of the cone = "+vcn+" cube units.");
        }
    }
}
