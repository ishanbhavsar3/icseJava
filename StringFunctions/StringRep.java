import java.util.Scanner;
public class StringRep
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str, str2; char ch, ch2, ch3; int count = 0;
        System.out.println("Enter a sentence ");
        str = sc.nextLine(); str2 = str.toLowerCase();
        System.out.println("Input a character whose occurence you wish to find.");
        ch2 = sc.next().charAt(0);
        ch3 = Character.toLowerCase(ch2);
        for (int i = 0; i < str.length(); i++) 
        {
            ch = str2.charAt(i);
            if(ch==ch3)
            {
                count+=1;
            }
        }
        System.out.println("The string you inputted is \n"+str);
        System.out.println("occurence of "+ch2+" is "+count+" times.");
    }
}