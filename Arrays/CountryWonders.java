import java.util.Scanner;
public class CountryWonders
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String country[] = {"India" , "Rome", "China", "Mexico", "Jordan", "Egypt"};
        String wonders[] = {"Taj Mahal", "Colosseum", "Great Wall of China","Chechen Itza", "Petra", "Great Pyramid of Giza"};
        System.out.println();
        for(int i = 0; i < country.length; i++)
        {
            System.out.println(country[i]+"\t\t"+wonders[i]);
        }
        String str;
        int index = 0, found = 0;
        System.out.print("Enter name of country whose wonder you wish to see : ");
        str = sc.nextLine();
        for(int i = 0; i < country.length; i++)
        {
            if(str.equalsIgnoreCase(country[i]))
            {
                index = i;
                found = 1;
                break;
            }
        }
        if(found!=1)
        {
            System.out.println("\nThe country has no wonder(s)");
        }
        else
        {
            System.out.println(country[index]+" is present at index "+index+" and the wonder is "+wonders[index]);
        }
    }
}
