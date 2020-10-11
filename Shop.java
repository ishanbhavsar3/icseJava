import java.util.Scanner;
public class Shop
{
    void bill()
    {
        System.out.println("Please input product code");
        
        Scanner o = new Scanner(System.in);
        long pc = o.nextLong();
        
        System.out.println("Please input price per piece of product.");
        double pr = o.nextDouble();
        
        System.out.println("Please input quantity of goods required.");
        double qty = o.nextDouble();
        
        double cost = qty*pr;
        
        double d_cost = (cost - 0.15*cost);
        
        System.out.println("Product code : "+pc);
        System.out.println("Price per piece of product = Rs."+pr);
        System.out.println("Quantity of product required = "+qty);
        System.out.println("Total cost of product = Rs."+cost);
        System.out.println("Cost of product after 15% discount on total cost = Rs."+d_cost);
    }
}