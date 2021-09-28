import java.util.Scanner;
public class GCD
{
    void loopCalc()
    {
        int gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input one number for GCD: ");
        int a = sc.nextInt();
        System.out.println("Input second number for GCD: ");
        int b = sc.nextInt();
        for(int i = 1; i <= a && i <= b; i++)  
        {  
            if(a%i==0 && b%i==0)  
            {
                gcd = i;  
            }
        }   
        System.out.println("The GCD of "+a+" and "+b+" is "+gcd);
    }
    void arithmatica()
    {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input one number for GCD: ");
        a = sc.nextInt();
        System.out.println("Input second number for GCD: ");
        b = sc.nextInt();
        if(a>b)
        {
            c = a % b;
            d = b / c;
            System.out.println("The GCD of "+a+" and "+b+" is "+c);
        }
        else
        {
            c = b % a;
            d = a / c;
            System.out.println("The GCD of "+a+" and "+b+" is "+c);
        }
    }
    public static void main()
    {
        GCD call = new GCD();
        System.out.println("Input 1 to find GCD using loops.\nInput 2 to find GCD using arithmetic operations");
        Scanner sc = new Scanner(System.in);
        byte ask = sc.nextByte();
        if(ask==1)
        {
            call.loopCalc();
        }
        else if(ask==2)
        {
            call.arithmatica();
        }
        else
        {
            System.exit(0);
        }
    }
}