import java.util.Scanner;

public class FiveChars
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        System.out.println("Next 5 characters from " + ch + " are:");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(++ch);
        }
    }
}