import java.util.Scanner;
public class HomeCodes {

    public static void main(String[] args) {
        String[] house = new String[]{"Ketan", "Jigna", "Aarti", "Rajnikant", "Ishan"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your code.");
        long ask = sc.nextLong();
        if (ask == 2612) {
            System.out.println("Welcome, " + house[0]);
        } else if (ask == 1611) {
            System.out.println("Welcome, " + house[1]);
        } else if (ask == 104) {
            System.out.println("Welcome, " + house[2]);
        } else if (ask == 3101) {
            System.out.println("Welcome, " + house[3]);
        } else if (ask == 303 ) {
            System.out.println("Welcome, " + house[4]);
        } else {
            System.out.println("You are not a member.");
        }
    }
}
