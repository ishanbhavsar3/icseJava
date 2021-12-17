import java.util.Scanner;
class DigitFrequency
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,safe,digits,i;
        int count[] = new int[10];
        System.out.println("Enter Number to get digit frequency");
        num = sc.nextInt();
        safe=num;
        while(safe>0)
        {
            digits = safe%10;
            for(i=0;i<=9;i++)
            {
                if(digits==i)
                {
                    count[i]++;
                }
            }
            safe = safe / 10;
        }
        System.out.println("Original Number inputted : "+num);
        for(i=0;i<=9;i++)
        {
            if(count[i]!=0)
            {
                System.out.println("Frequency of "+i+" is : "+count[i]);
            }
        }
    }
}

