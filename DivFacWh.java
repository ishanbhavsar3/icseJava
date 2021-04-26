
public class DivFacWh
{ 
    public static void main(int n) 
    { 
        int i = 1; 
        int sum = 0;
        System.out.println("Factors of "+n);
        while(i<=n)
        {
            if (n%i==0) 
            {
                System.out.println(i); 
                sum += i;
            }  
            i++;
            
        }
        System.out.println("Sum of factors of "+n+" = "+sum);
    } 
} 

