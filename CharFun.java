import java.util.Scanner;
public class CharFun
{
    public static void main()
    {
        System.out.println("Input a word.");
        System.out.println("Input an integer to fetch its equivalent alphabet ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        System.out.println(a.charAt(b));
    }
    public static void m()
    {
        System.out.println("Input a word.");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Input a character whose index number you want to fetch.");
        char b = sc.next().charAt(0);
        if(a.charAt(0)==b)
        {
            System.out.println();
        }
    }
}