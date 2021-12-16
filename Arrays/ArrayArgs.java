import java.util.Scanner;

public class ArrayArgs {
    public int add(int[] a)
    {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] inp = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 5 elements into the array: " );
        for(int i = 0; i<inp.length; i++)
        {
            inp[i] = sc.nextInt();
        }
        ArrayArgs call = new ArrayArgs();
        int answer = call.add(inp);
        System.out.println("The sum of the 5 elements of the array is "+answer);
    }
}
