public class Largest
{
     public static void main(String[] args)
    {
        System.out.println("Input three numbers to find the largest among all.");
        Scanner sc = new Scanner(System.in);
        int d, e, f; d = sc.nextInt();
        e = sc.nextInt(); f = sc.nextInt();
        int large_ = larger(d,e,f);
        System.out.println("Largest Integer = "+large_); 
    }
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
}
