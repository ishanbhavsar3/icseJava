import java.util.Scanner;

public class PrimePalindrome
{
    private int num;
    private int f;
    private int rev;

    public PrimePalindrome(int n) {
        num = n;
        f = 0;
        rev = 0;
    }

    public int prime() {
        f = 1;
        if (num == 0 || num == 1)
            f = 0;
        else
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    f = 0;
                    break;
                }
            }
        return f;
    }

    public int reverse() {
        
        int t = num;
        
        while (t != 0) {
            int digit = t % 10;
            rev = rev * 10 + digit;
            t /= 10;
        }
        
        return rev;
    }
    
    public void display() {
        if (f == 1 && rev == num)
            System.out.println(num + " is prime palindrome");
        else
            System.out.println(num + " is not prime palindrome");
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = in.nextInt();
        
        Calculate obj = new Calculate(x);
        obj.prime();
        obj.reverse();
        obj.display();
    }
}
