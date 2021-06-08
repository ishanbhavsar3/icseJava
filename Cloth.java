import java.util.Scanner;

public class Cloth {
    void Src() {
        System.out.println("Please input the total cost to get your final amount to be paid.");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a < 2000) {
            System.out.println("Amount to be paid by you = ₹" + (95 * a) / 100);
        } else if (a <= 5000 && a > 2000) {
            System.out.println("Amount to be paid by you = ₹" + (75 * a) / 100);
        } else if (a <= 10000 && a > 5000) {
            System.out.println("Amount to be paid by you = ₹" + (65 * a) / 100);
        } else if (a > 10000) {
            System.out.println("Amount to be paid by you = ₹" + (50 * a) / 100);
        } else {
            System.out.println("Your amount is ₹" + a);
        }
    }

    public static void main(String[] args) {
        Cloth call = new Cloth();
        call.Src();
    }
}

