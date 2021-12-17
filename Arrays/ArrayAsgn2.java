import java.util.Scanner;
public class ArrayAsgn2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] cod = new int[4];
        int[] qty = new int[4];
        double[] pric = new double[4];
        System.out.println("Please input the product code of the four products you brought.");
        for(int i = 0; i<cod.length; i++)
        {
            cod[i] = sc.nextInt();
        }
        System.out.println("Please input the price of the four products you brought: ");
        for(int k = 0; k<pric.length; k++)
        {
            pric[k] = sc.nextDouble();
        }
        System.out.println("Please input the quantity of the four products you brought: ");
        for(int j = 0; j<qty.length; j++)
        {
            qty[j] = sc.nextInt();
        }
        for(int f = 0; f<cod.length; f++)
        {
            double tc = pric[f] * qty[f];
            System.out.println("Product code\tPrice\tQuantity\tTotal Cost");
            System.out.println("\t"+cod[f]+"\t\t   Rs."+pric[f]+"\t\t"+qty[f]+"\t\tRs."+tc);
        }
    }
}
