public class CompExam
{
    public static void main()
    {
        int questions = 150;
        int p_cent1 = 80;
        int p_cent2 = 72;
        double candidate_1 = questions*p_cent1/100;
        double candidate_2 = questions*p_cent2/100;
        System.out.println("Number of correct answers by candidate 1: "+candidate_1);
        System.out.println("Number of correct answers by candidate 2: "+candidate_2);
    }
}