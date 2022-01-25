import java.util.Scanner;
public class TriangleType
{
    void checker(int a, int b, int c)
    {
        if(a == b && b == c)
            System.out.println("The triangle is equilateral.");
        else if (a==b || b==c || c==a) 
            System.out.println("The triangle is isosceles.");
        else if (a!=b && b!=c) 
            System.out.println("The triangle is scalene.");
        else
            System.out.println("Invalid inputs");
    }
    public static void main(String[] args)
    {
        int one, two, three;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three sides of triangle to get its type.")
        
        one = sc.nextInt();
        two = sc.nextInt();
        three = sc.nextInt();
        
        TriangleType call = new TriangleType();
        call.checker(one, two, three);
    }
}
