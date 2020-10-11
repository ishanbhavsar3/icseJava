import java.util.*;
public class Min
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double min_1 = Math.min(a,b);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double min_2 = Math.min(x,y);
        double min_3 = Math.min(min_2,z);
        System.out.println("The smaller of two numbers "+a+" and "+b+" is "+min_1);
        System.out.println("The smallest of three numbers "+x+" , "+y+" and "+z+" is "+min_1);
    }
}