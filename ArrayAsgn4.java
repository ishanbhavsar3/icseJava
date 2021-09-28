public class ArrayAsgn4 
{
    public static void main() 
    {
        int[] P = {4, 6, 1, 2, 3, 10};
        int[] Q = {19, 23, 7, 8};
        int[] R = new int[10];
        int k = 0;
        while(k < P.length)
        {
            R[k] = P[k];
            k++;
        }
        int j = 0;
        while(j < Q.length)
        {
            R[k++] = Q[j++];
        }
        System.out.println("Elements of Array R:");
        for (int f = 0; f < R.length; f++)
        {
            System.out.print(R[f] + " ");
        }
    }
}