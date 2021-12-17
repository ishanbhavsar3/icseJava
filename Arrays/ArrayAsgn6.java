import java.util.Arrays;
public class ArrayAsgn6 
{
    public static void main(String[] args) 
    {
        int[] A = {2, 3, 6, 8};
        int[] B = {2, 3, 6, 8};
        System.out.println("Array A: ");
        for(int i = 0; i<A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println("\nArray B: ");
        for(int j = 0; j<B.length;j++)
        {
            System.out.print(B[j]+" ");
        }

        if(Arrays.equals(A, B))
        {
            System.out.print("\nBoth the arrays are identical");
        }
        B = new int[]{4, 3, 7, 8};

        System.out.println("\nArray A : ");
        for(int l = 0; l<A.length; l++)
        {
            System.out.print(A[l]+" ");
        }

        System.out.println("\nArray B : ");
        for (int k = 0; k<B.length; k++)
        {
            System.out.print(B[k]+" ");
        }
        if (!Arrays.equals(A, B))
        {
            System.out.println("\nBoth the arrays are not identical");
        }
    }
}
