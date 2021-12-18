import java.util.Scanner;

public class StringChange {
    public static void main(String[] args) {
        String rev, str;
        int words;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        System.out.println("Entered string is "+str);
        // use of function to find length of the string.
        System.out.println("The length of the entered string is "+str.length());
        words = 0; //for counting the number of words in string.
        for (int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)==' ')
            {
                words+=1;
            }
        }
        System.out.println("Total number of words in the string is "+(words+1));
        //reversing the string using the following for loop
        rev = "";
        for (int i = str.length()-1; i>=0; i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("The reversed string = "+rev);
        if (str.equals(rev))
        {
            System.out.println(str+" is a palindrome string.");
        }
        else
        {
            System.out.println(str+" is not a palindrome string.");
        }
    }
}
