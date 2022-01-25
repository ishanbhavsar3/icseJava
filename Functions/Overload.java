public class Overload
{
    void check(char ch)
    {
        System.out.println("Inputted Character = "+ch);
        ch++;
        System.out.println("Next Character = "+ch);
    }
    char check(int m)
    {
        System.out.println("Character equivalent of the integer you put is : "+(char)m);
        return (char)m;
    }
    void check(char ch1,char ch2)
    {
        ch1--;
        System.out.println("Previous character of ch1 = "+ch1);
        ch2-=2;
        System.out.println("Second Previous character of ch2 = "+ch2);
    }
    void Runme()
    {
        check('a');
        check(65);
        check('b','c');
    }
}
