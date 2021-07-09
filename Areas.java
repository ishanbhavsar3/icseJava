import java.util.Scanner;
public class Areas {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Areas call = new Areas();
        System.out.println("Input 0 for square area calculator\nInput 1 for rectangle area calculator\nInput 2 for triangle area calculator");
        byte ask = sc.nextByte();
        switch(ask)
        {
            case 0:
            System.out.println("Please enter the side of the square.");
            double side = sc.nextDouble();
            System.out.println("The area of the square is "+(side*side)+" square units.");
            break;
            case 1:
            System.out.println("Please enter the length of the rectangle.");
            double length = sc.nextDouble();
            System.out.println("Please enter the breadth of the rectangle.");
            double breadth = sc.nextDouble();
            System.out.println("The area of the rectangle is "+(length*breadth)+" square units.");
            break;
            case 2:
            System.out.println("Please enter one side of the triangle.");
            double a = sc.nextDouble();
            System.out.println("Please enter second side of the triangle.");
            double b = sc.nextDouble();
            System.out.println("Please enter third side of the triangle.");
            double c = sc.nextDouble();
            double S = (a+b+c)/2;
            double AREA = Math.sqrt(S*(S-a)*(S-b)*(S-c));
            System.out.println("The area of the triangle is "+AREA+" square units.");
            break;
            default:
            System.out.println("Please input correct numbers only for getting access to corresponding calculators.");
        }
    }
}