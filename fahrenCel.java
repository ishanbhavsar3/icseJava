import java.util.Scanner;
public class fahrenCel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("Input c for fahrenheit to celsius conversion.");
        System.out.println("Input f for celsius to fahrenheit conversion.");
        char in = sc.next().charAt(0);
        switch(in)
        { 
            case 'c':
            System.out.println("Input temperature in fahrenheit for conversion to celsius .");
            double f = sc.nextDouble();
            double f_c = (5*(f-32))/9;
            System.out.println("Equivalent temperature of "+f+"°F in celsius = "+f_c+"°C.");
            break;
            
            case 'f':
            System.out.println("Input temperature in celsius for conversion to fahrenheit .");
            double c = sc.nextDouble();
            double c_f = (1.8*c)+32;
            System.out.println("Equivalent temperature of "+c+"°C in fahrenheit = "+c_f+"°F.");
            break;
            
            default:
            System.out.println("input only c and f for conversion from fahrenheit to celsius and vice versa respectively.");
        }
        
    }
}