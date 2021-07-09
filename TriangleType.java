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
}