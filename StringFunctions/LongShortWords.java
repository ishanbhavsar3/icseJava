import java.util.Scanner;

public class LongShortWords
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to get longest & shortest word.");
        
        String snt = sc.nextLine();
        snt+=" ";
        String wrd="",lngw="", swrd=snt;
        for(int i = 0; i<snt.length(); i++)
        {
            char ch = snt.charAt(i);
            if(ch==' ')
            {
                if(wrd.length()>lngw.length())
                {
                     lngw = wrd;   
                }
                if(wrd.length()<swrd.length())
                {
                    swrd = wrd;
                }
                wrd = "";
            }
            else
            {
                wrd+=ch;
            }
        }
        System.out.println("Longest word: "+lngw+" ; length = "+lngw.length());
        System.out.println("Shortest word: "+swrd+" ; length = "+swrd.length());
    }
}