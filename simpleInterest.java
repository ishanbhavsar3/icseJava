class simpleInterest
{
    double Interest(double p_amt, double rate, int time)
    {
        double SI = (p_amt*rate*time)/100;
        return(SI);
    }
    void showOutput(double p , double r, int t)
    {
        double printNeed = Interest(p,r,t);
        System.out.println(printNeed);
    }
}