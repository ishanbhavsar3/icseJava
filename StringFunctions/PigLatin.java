import java.util.Scanner;
public class PigLatin
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word for its PigLatin.");
        String wrd = sc.nextLine().toUpperCase();
        int i;
        //vowel finding begins
        for(i = 0; i<wrd.length(); i++)
        {
            char ch = wrd.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                break;
        }
        String brkn = wrd.substring(i)+wrd.substring(0,i)+"AY";
        System.out.println(brkn);
    }
}
    