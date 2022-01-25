public class Number 
{
    int minimum(int n1,int n2)
    {
        int smaller = (n1<n2) ? n1:n2 ;
        return smaller;
    }
    char minimum(char x1,char x2)
    {
        char min = x1<x2 ? x1:x2 ;
        return min;
    }
    public void run()
    {
        int res = minimum(15,30);
        char res2 = minimum('W','E');
        System.out.println(res);
        System.out.println(res2);
    }
}
