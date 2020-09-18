public class Mock3_A    
{
    public static void main()
    {
        int science = 50; // marks are out of 80.
        int eng = 30;
        int math = 40; 
        System.out.println("Marks in English = "+eng+"/80");
        System.out.println("Marks in Math = "+math+"/80");
        System.out.println("Marks in Science = "+science+"/80");
        double total = (eng+math+science);
        System.out.println("Total marks = "+total+"/"+80*3);
        System.out.println("Percentage of marks secured = "+(total/240)*100+" %");
    }
}