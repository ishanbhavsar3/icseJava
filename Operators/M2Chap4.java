public class M2Chap4
{
    public static void main(String[] args)
    {
        System.out.println("Postfix Operators");
        int a = 3;
        System.out.println("a");
        int x = a++;
        System.out.println(x);
        System.out.println(a);
        int f = 12;
        int n = 11111;
        System.out.println("12 + 11111 = "+ n+f);
        
        if(1>2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        if(1<2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        if(1==2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        if(1!=2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        System.out.println("Logical Operator AND &&");
        
        System.out.println((5>4) && (7!=4));
        System.out.println((5>4) && (7==4));
        
        System.out.println("Logical Operator OR ||");
        
        System.out.println((5>4) || (7!=4));
        System.out.println((5>4) || (7==4));
        
        System.out.println("Logical Operator NOT !");
        
        System.out.println(!(5>4));
        System.out.println(!(5<4));
        
        int x1 = 6;
        int y1 = 3;
        
        System.out.println(x1<10 && y1>1);
        System.out.println(x1==5 && y1==5);
        System.out.println(!(x1==y1));
    }//function end 
}//class end 
