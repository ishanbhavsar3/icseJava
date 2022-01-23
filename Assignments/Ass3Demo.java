public class Ass3Demo
{
    public static void main()
    {
        char ch = 'A';
        char ch1 = 'b';
        
        //Logic - A = 65, a = 97
        //Therefore +32 for obtaining lowercase a
        
        int a;
        System.out.println("Uppercase = "+ch);
        a = (int) ch;
        a = a + 32;
        ch = (char) a;
        System.out.println("Lowercase = "+ch);
        
        //Logic - B = 66, b = 98
        //Therefore -32 for obtaining uppercase B
        
        int b;
        System.out.println("Lowercase = "+ch1);
        b = (int) ch1;
        b = b - 32;
        ch1 = (char) b;
        System.out.println("Uppercase = "+ch1);
    }
}
