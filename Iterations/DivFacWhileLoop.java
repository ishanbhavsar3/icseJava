import java.util.Scanner;
public class DivFacWhileLoop
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number to get its factors.");
        int n = sc.nextInt(); int i = 1; int sum = 0;
        System.out.println("Factors of "+n);
        while(i<=n) {      
            if (n%i==0) {            
                System.out.println(i); 
                sum += i;
            } i++;            
        }
        System.out.println("Sum of factors of "+n+" = "+sum);
    } 
} // (c) 2021 - 2022 Ishan Ketan Bhavsar
