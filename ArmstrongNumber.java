import java.util.Scanner;
public class ArmstrongNumber 
{
   public static void main() {
      int remainder , sum = 0;
      System.out.println("Enter the number");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int check= number;
      while(check != 0) {
         remainder = check % 10;
         sum = sum + (remainder * remainder * remainder);
         check = check / 10;
      }
      if(sum == number)
         System.out.println("Inputted number is an armstrong number.");
      else
         System.out.println("Inputted number is not an armstrong number.");
   }
}