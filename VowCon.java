import java.util.Scanner;
public class VowCon
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowel");
            break;
            default:
            System.out.println("Constant");
        }
    }
}