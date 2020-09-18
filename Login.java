import java.util.Scanner;
class Login
{
    void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your UID no.");
        char F = scan.next().charAt(0);
        if(F=='A')
        {
            System.out.println("Welcome , Ishan  Bhavsar");
        }
    }
}