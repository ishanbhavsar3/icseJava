public class Height
{
    void changeHeight(int height)
    {
        int height_F = height/12;
        int height_I = height%12;
        
        System.out.println("Height of "+height+" inches = "+height_F+" feet and "+height_I+" inches");
    }
    public static void main(int height_)
    {
        Height obj1 = new Height();
        obj1.changeHeight(height_);
    }
}