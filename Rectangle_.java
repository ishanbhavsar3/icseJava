 class Rectangle_
{
    double length;
    double breadth;
    void Accept(double l,double b)
    {
        length = l;
        breadth = b;
    }
    void showArea()
    {
        double area = length*breadth;
        System.out.println("Area of rectangle = "+area);
    }
    public static void main()
    {
        Rectangle_ obj = new Rectangle_();
        obj.Accept(15.4,12.4);
        obj.showArea();
    }
}