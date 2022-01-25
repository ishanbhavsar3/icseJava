import java.util.Scanner;
public class NumberPatterns
{
    public static void main(String[] args)  
    {
        int i=0, j=0 ,s=0; 
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        switch(a)
        {
            case 1:
            // 0 3 8 15 24 35 48 63 80 99 
            System.out.println("Enter a number");
            int n = sc.nextInt();
            while(i<n) 

            {
                System.out.print(j+" "); 
                j = j + 3 + s;
                i = i + 1; 
                s = s + 2;
            }
            break;
                
            case 2:
            // 0 3 8 15 24 35 48 63 80 99 
            // same as case 1 but in do - while.
            System.out.println("Enter a number");
            int b = sc.nextInt();
            do
            {
                System.out.print(j+" "); 
                j = j + 3 + s;
                i = i + 1; 
                s = s + 2;
            } while(i<b);
            break;

            case 3:
            // (square root - 1) pattern
            System.out.println("Enter a number");
            int f = sc.nextInt();
            for(i = 1; i<=f; i++)
            {
                System.out.print(((i*i) - 1) + " ");
            }
            break;
                
            default:
            {
                System.out.println("null");
            }
        }  
    }
}
