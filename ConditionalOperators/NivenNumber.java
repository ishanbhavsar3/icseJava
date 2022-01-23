import java.util.Scanner;
public class NivenNumber  
{  
    public static void main() 
    {  
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();  
        int rem = 0, sum = 0, n;  
        n = num;  
        while(num > 0)
        {  
            rem = num%10;  
            sum = sum + rem;  
            num = num/10;  
        }  
        if(n%sum == 0)  
            System.out.println(n + " is Niven number");  
        else  
            System.out.println(n + " is not a Niven number");  
    }  
}  
