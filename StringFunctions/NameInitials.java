import java.util.Scanner;
public class NameInitials
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str, printSurname;
        char nameInitial, mNameInitial;
        int count, count2;
        
        System.out.println("Please enter your full name including your middle name.");
        /* 
         * Assume the name to be John Michael Doe
         * The output shall be J.M.Doe
         */
        str = sc.nextLine();
    
        // taking the name initial and capitilazing it.
        nameInitial = Character.toUpperCase(str.charAt(0));
        //searching for first whitespace index following which will be the middle initial
        count = str.indexOf(" ");  
        //searching for last whitespace index following which will be the surname.
        count2 = str.lastIndexOf(" ");

        //adding 1 to count to get middle initial and turning it to uppercase.
        mNameInitial = Character.toUpperCase(str.charAt(++count)); 
        /* Adding 1 to count2 to get surname initial, then capitalizing it.
         * The substring prints the rest of surname.
         */
        printSurname = (Character.toUpperCase(str.charAt(count2+1)) + (str.substring(count2+2)));
        
        System.out.println(nameInitial+"."+mNameInitial+"."+printSurname);
    }
}
