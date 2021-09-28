import java.util.Scanner;

public class Multiple_Arrays 
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        int[] roll = new int[4];
        int[] ca = new int[4];
        int[] eng = new int[4];
        int[] math = new int[4];
        System.out.println("Please enter roll number & CA, English and Math marks of students.");
        for (int i = 0; i<roll.length; i++)
        {
            System.out.println("Enter details for student number "+i);
            roll[i] = sc.nextInt();
            ca[i] = sc.nextInt();
            eng[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        System.out.println("Entered details for the student are: ");
        System.out.println("roll\tca\teng\tmath\n");
        for (int a = 0; a<roll.length; a++)
        {
            System.out.println(roll[a]+"\t"+ca[a]+"\t"+eng[a]+"\t"+math[a]);
        }
        double[] avg = new double[4];
        System.out.println("Calculating average for each student: ");
        for(int j = 0; j< roll.length; j++)
        {
            avg[j] = (ca[j]+eng[j]+math[j]) / 3.0;
            System.out.println("Average marks for student "+j+" is: "+avg[j]);
            if(avg[j]>80)
            {
                System.out.println("Student "+j+" has average greater than 80.");
            }
            else if (avg[j]<40)
            {
                System.out.println("Student "+j+" has average less than 40.");
            }
        }
    }
}