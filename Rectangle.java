public class Rectangle
{
    double length;
    double breadth;
    void showArea()
    {
        double area = length*breadth;
        System.out.println("Area of rectangle = "+area);
    }
    void runMe()
    {
        Rectangle obj1 = new Rectangle();
        obj1.length = 1.5;
        obj1.breadth = 3.0;
        obj1.showArea();
        
        Rectangle obj2 = new Rectangle();
        obj2.length = 1.7;
        obj2.breadth = 2.0;
        obj2.showArea();
    }
}