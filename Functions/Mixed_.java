import java.util.Scanner;
class Mixed_

{
    void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Put in a number to check odd or even");

        int num = obj.nextInt();

        if(num%2==0)
        {
            System.out.println("The number "+num+" is even");
        }
        else
        {
            System.out.println("The number "+num+" is odd");
        }
    }

    void character()
    {
        char ch;
        int m;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Character in Lowercase : ");

        ch = scan.next().charAt(0);

        m = (int) ch;
        m = m - 32;
        ch = (char) m;

        System.out.print("Equivalent Character in Uppercase = " +ch);
    }

    void shit()
    {

        Scanner fun = new Scanner(System.in);
        System.out.println("Input an integer to check if it is equal to 1 or not.");
        int f = fun.nextInt();
        if(f==1)
        {
            System.out.println("The number "+f+" is equal to 1");
        }
        else
        {
            System.out.println("The number "+f+" is not equal to 1");
        }
    }

    void kid()
    {

        Scanner KidsLove = new Scanner(System.in);
        System.out.println("Input a character from A to Z");
        char KL = KidsLove.next().charAt(0);
        if((int)KL>=97)
        {
            System.out.println("The character you put is lowercase "+KL+".");
            System.out.println("The ASCII value of "+KL+" is "+(int)KL);
        }
        else
       {
           System.out.println("The character you put is uppercase "+KL+".");
           System.out.println("The ASCII value of "+KL+" is "+(int)KL);
       }
    }

    void hello()
    {
        Scanner M = new Scanner(System.in);
        System.out.println("Input any number to check its character out. ");
        int mm = M.nextInt();
        if(mm>1)
        {
            System.out.println("The number "+mm+"'s character is "+(char)mm);
        }
        else
        {
            System.out.println("Obey instructions please.");
        }
    }
}
