import java.util.Scanner;
public class Shop
{
    public static void main(String[] args)
    {
        GST call = new GST();
        double dc2;
        double nA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input price of product.");
        double pr = sc.nextDouble();
        System.out.println("Input quantity purchased of product.");
        int qt = sc.nextInt();
        double tc = pr*qt;
        System.out.println("Input a for intra - state and b for interstate transaction.");
        char ab = sc.next().charAt(0);
        System.out.println("Price of product = Rs."+pr);
        System.out.println("Quantity of Product = "+qt);
        System.out.println("Total Cost before GST = Rs."+tc);
        call.main(tc,ab);
    }
}