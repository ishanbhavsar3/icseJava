public class Box
{
    double width;
    double height;
    double depth;
    void getData(double w,double h,double d)
    {
          width= w;
         height = h;
         depth = d;
         double vol = width*height*depth;
         System.out.println("The volume of the box having height "+h+" units, width "+w+" units and depth as "+d+" units is equal to "+vol);
    }
}