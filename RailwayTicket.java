import java.util.Scanner;

public class RailwayTicket
{
    String name, coach;
    long mobno;
    int amt, totalamt;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        name = sc.nextLine();
        System.out.print("Please enter the name of coach you want to travel in : \nFirst AC\nSecond_AC\nThird_AC\nsleeper ");
        coach = sc.nextLine();
        System.out.print("Please enter your mobile number : ");
        mobno = sc.nextLong();
        System.out.print("Input the amount to be paid by you as 200 : ");
        amt = sc.nextInt();
    }
    void update()
    {
        switch (coach) {
            case "First AC" : totalamt = amt + 700;
            break;
            case "Second_AC" : totalamt = amt + 500;
            break;
            case "Third_AC" : totalamt = amt + 250;
            break;
            case "sleeper" : totalamt = amt;
            break;
            default : System.out.println("Please input proper coach name as mentioned only.");
        }
    }
    void display()
    {
        System.out.println("Hello! Hope you are having a good day.\nYour name is "+name);
        System.out.println("Your mobile number is "+mobno);
        System.out.println("You will be travelling in "+coach+" coach.");
        System.out.println("The total amount you have to be pay is Rs."+totalamt);
    }
    public static void main(String[] args) {
        RailwayTicket call = new RailwayTicket();
        call.accept();
        call.update();
        call.display();
    }
}