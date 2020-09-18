public class Large
{
    int larger(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                return(a);
            }
            else
            {
                return(c);
            }
        }
        else
        {
            if(b>c)
            {
                return(b);
            }
            else
            {
                return(c);
            }   
        }
    }
    void show(int d,int e,int f)
    {
        int large_ = larger(d,e,f);
        System.out.println("Largest Integer = "+large_);
    }
}