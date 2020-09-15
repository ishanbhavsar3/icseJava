public class Demo_
{
    int display(int a,int b)
    {
        int s_sum = ((a*a)+(b*b));
        return(s_sum);
    }
    void show(int c,int d)
    {
        int ss_print = display(c,d);
        System.out.println(ss_print);
    }
    double display_(double e,double f)
    {
        double ds_sum = ((e*e)+(f*f));
        return(ds_sum);
    }
    void show(double g,double h)
    {
        double dss_print = display_(g,h);
        System.out.println(dss_print);
    }
}