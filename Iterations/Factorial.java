import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to get its factorials.")
        int num = sc.nextInt();
        int i;
        int ftr=1;  
        /*
        *The factorial of a number is the function that
        *multiplies the number by every natural number below it. 
        *Symbolically, factorial can be represented as "!".
        *So 5! = 5*4*3*2*1 = 120
        */
        for(i=1;i<=num;i++)
        {    
            ftr=ftr*i;    
        }    
        System.out.println("Factorial of "+num+" is: "+ftr);    
    }  
} // (c) 2021 - 2022 Ishan Ketan Bhavsar
