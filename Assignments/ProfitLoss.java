public class ProfitLoss
{
    public static void main()
    { 
        double cp1,cp2,profit,loss;
        double sp= 475.75;
        double profitPercent=20,lossPercent=20;

        profit=(profitPercent*sp)/100;
        loss=(lossPercent*sp)/100;

        cp1=sp-profit;
        cp2=sp+loss;

        System.out.println("Cost price of Calculator which the shopkeeper sold on profit : Rs."+cp1);
        System.out.println("Cost price of Calculator which the shopkeeper sold on loss : Rs."+cp2);

        /*
        * formula for profit percent = profit/sp*100
        * formula for loss percent = loss/sp*100
       
        * where cp is cost price and sp is selling price,
       
        * profit=(profit percent *sp)/100
        * loss=(loss percent *sp)/100

        * hence by calculating profit and loss we can calculate cp
        */
    }
}
