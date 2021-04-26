public class Factorial
{

    public static void main(int num)
    {  
        int i;
        int ftr=1;  
        
        for(i=1;i<=num;i++)
        {    
            ftr=ftr*i;    
        }    
        System.out.println("Factorial of "+num+" is: "+ftr);    
    }  
}  

