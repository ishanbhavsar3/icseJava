
/**
 * Write a description of class Calc3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calc3
{
    public static void main()
    {
        double sp = 475.75;
        double cp1,cp2,px,lx;
        px = (475.75*5)/6;
        lx = (475.75*5)/4;
        cp1 = (sp / (1 + (px / 100)));
        cp2 = (sp / (1 - (lx / 100)));
        System.out.println(cp1);
        System.out.println(cp2);
    }
}
