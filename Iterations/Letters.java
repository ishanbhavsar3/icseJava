import java.util.Scanner;
public class Letters
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter '1' to display upper case letters from Z to A");
        System.out.println("Enter '2' to display lower case letters from a to z");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();
        int count = 0;
        switch (ch) {
            case 1:
                for (int i = 90; i >= 65; i--) {
                    char c = (char)i;
                    System.out.print(c);
                    System.out.print(" ");
                    count++;

                    //Print 10 characters per line
                    if (count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
                break;
            case 2:
                for (int i = 97; i < 123; i++) {
                    char c = (char)i;
                    System.out.print(c);
                    System.out.print(" ");
                    count++;
                    //Print 10 characters per line
                    if (count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
                break;
            default:
                System.out.println("Incorrect Choice");
        }
    }
}
