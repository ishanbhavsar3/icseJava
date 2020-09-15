public class Circle 
{
    double radius;
    void accept(double r)
    {
        radius = r;
    }
    double computeArea()
    {
        double area = 3.141*radius*radius;
        return area;
    }
    void showOutput()
    {
        double red = 12.5;
        accept(red);
        
        double area_c = computeArea();
        System.out.println("Area of circle = "+area_c);
    }
}