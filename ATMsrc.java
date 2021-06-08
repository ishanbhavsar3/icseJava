import java.util.Scanner;
public class ATMsrc {
    double balance = 100000, withdraw, deposit;
    int choice;
    Scanner sc = new Scanner(System.in);
    void src() {
        ATMsrc call = new ATMsrc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to nexBank ATM.");
        System.out.println("Please enter your ID: ");
        long id = sc.nextLong();
        System.out.println("Please enter your password: ");
        int pass = sc.nextInt();
        if (id == 9876543 && pass == 9876) {
            System.out.println("""
                    Welcome to nexBank ATM
                                       
                    Please choose the account you want to access.
                                       
                    Input 1 for General Account
                    Input 2 for Savings Account
                    Input 3 for Exit.
                     """);
            int choice = sc.nextInt();
            switch (choice) {
                case 1, 2 -> call.Account();
                case 3 -> {
                    System.out.println("Thanks for using our nexBank ATM.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please give proper input. Press 0 for rerun or 1 to exit.");
                    byte ask = sc.nextByte();
                    if (ask == 1) {
                        ATMsrc obj = new ATMsrc();
                        obj.src();
                    } else if (ask == 0) {
                        System.out.println("Thanks for using our nexBank ATM.");
                    }
                }
            }
        }
    }
    void Account() {
        System.out.println("General Account: \n 1 to Withdraw funds. \n 2 to Deposit funds \n 3 to check Balance. \n 4 to exit.");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Please enter the amount you wish to withdraw.");
                withdraw = sc.nextDouble();
                System.out.println("Thanks for using  nexBank ATM. \nPlease take your amount of ₹" + withdraw);
                balance = balance - withdraw;
                System.out.println("Input 0 to view balance or 1 to exit.");
                byte ask = sc.nextByte();
                if (ask == 1) {
                    System.exit(0);
                } else if (ask == 0) {
                    System.out.println("Your balance is ₹" + balance);
                }
            }
            case 2 -> {
                System.out.println("Please enter the amount you wish to deposit.");
                deposit = sc.nextDouble();
                System.out.println("Thanks for using nexBank ATM. \nYour deposit of ₹" + deposit + " is done.");
                balance = balance + deposit;
                System.out.println("Input 0 to view balance or 1 to exit.");
                byte ask = sc.nextByte();
                if (ask == 1) {
                    System.exit(0);
                } else if (ask == 0) {
                    System.out.println("Your balance is ₹" + balance);
                }
            }
            case 3 -> System.out.println("Your Balance is ₹" + balance + "\n Thanks for using nexBank ATM.");

            case 4 -> {
                System.out.println("Thanks for using nexBank ATM.");
                System.exit(0);
            }
        }
    }
}
