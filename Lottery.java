public class Lottery
{
    public static void main()
    {
        Scanner a = new Scanner(System.in);
        int l1 =  (int)(Math.random()*30);
        System.out.println("Get a chance to win Rs.10 by testing your luck.");
        System.out.println("Input a number between 0 and 30.");
        int c1 = a.nextInt();
        System.out.println("The number you inputted is "+c1+" and the lucky number is "+l1+".");
        if(c1==l1)
        {
            System.out.println("Your luck is good today! You have won the price of Rs.10!");
        }
        else
        {
            System.out.println("Your luck is not favouring you today :-(  ");
        }
        System.out.println("Input a number between 0 and 20.");
        int c2 = a.nextInt();
        int l2 =  (int)(Math.random()*20);
        System.out.println("The number you inputted is "+c2+" and the lucky number is "+l2+".");
        if(c2==l2)
        {
            System.out.println("Your luck is good today! You have won the price of Rs.10!");
        }
        else
        {
            System.out.println("Your luck is not favouring you today :-( ");
        }
        System.out.println("Input a number between 0 and 10.");
        int c3 = a.nextInt();
        int l3 =  (int)(Math.random()*10);
        System.out.println("The number you inputted is "+c3+" and the lucky number is "+l3+".");

        if(c3==l3)
        {
            System.out.println("Your luck is good today! You have won the price of Rs.10!");
        }
        else
        {
            System.out.println("Your luck is not favouring you today :-( ");
            System.out.println("Better luck next time");
        }
    }
}
