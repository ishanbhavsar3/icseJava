import java.util.Scanner;
public class Ar
{
    public static void showArithmetic()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num1 = sc.nextInt();
        System.out.println("Input another number");
        int num2 = sc.nextInt();
        System.out.println("Input operator to work on both");
        int opr = sc.next().charAt(0);
            if(opr=='+')
            {
                System.out.println(num1+num2);
            }
            else if(opr=='-')
            {
                System.out.println(num1-num2);
            }
            else if(opr=='/')
            {
                System.out.println(num1/num2);
            }
            else if(opr=='*')
            {
                System.out.println(num1*num2);
            }
            else
            {
                System.out.println("Please input arithmetic operator only to work on your numbers.");
            }
        }
    }
