import java.util.Scanner;
public class LoopingIt
{
    public static void main()  
    {
        int i=0, j=0 ,s=0; 
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        switch(a)
        {
            case 1:
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
            System.out.println("Enter a number");
            int f = sc.nextInt();
            for(i = 1; i<=f; i++)
            {
                System.out.print(((i*i) - 1) + " ");
            }
            break;
            
            case 3:
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
            
            default:
            {
                System.out.println("null");
            }
        }  
    }
}
