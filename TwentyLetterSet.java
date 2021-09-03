import java.util.Scanner;

public class TwentyLetterSet {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any 20 letters");
        int vc = 0, cc = 0;
        for (int i = 0; i < 20; i++) {
            char ch = in.next().charAt(0);
            ch = Character.toUpperCase(ch);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vc++;
            else if (ch >= 'A' && ch <= 'Z')
                cc++;
        }
        System.out.println("Number of Vowels = " + vc);
        System.out.println("Number of Consonants = " + cc);
    }
}