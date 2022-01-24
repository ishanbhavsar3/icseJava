import java.util.Scanner;
public class HCFLCM
{
   public static void main(String[] args)
   {
      int temp1, temp2, num1, num2, temp, hcf, lcm;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter First Number: ");
      num1 = scanner.nextInt();
      System.out.print("Enter Second Number: ");
      num2 = scanner.nextInt();
      
      /*
      * The full form of LCM in Maths is Least Common Multiple, 
      * whereas the full form of HCF is the Highest Common Factor. 
      * The H.C.F. defines the greatest factor present in between
      * given two or more numbers, whereas L.C.M. defines the least 
      * number which is exactly divisible by two or more numbers.
      */
      
      temp1 = num1;
      temp2 = num2;
      while(temp2 != 0) {
         temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
      }

      hcf = temp1; lcm = (num1*num2)/hcf;
      
      System.out.println("HCF of input numbers: "+hcf);
      System.out.println("LCM of input numbers: "+lcm);
   }
} // (c) 2021 - 2022 Ishan Ketan Bhavsar
