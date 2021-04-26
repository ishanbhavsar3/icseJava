public class SalaryCalculation
{
    long codeNo;
    double basicPay, specialAlw, conveyanceAlw, gross, pf, netSalary, annualSal;
    void giveValues()
    {
        SalaryCalculation call = new SalaryCalculation();
        call.codeNo = (long) (Math.random() * 10000);
        call.basicPay = 20000.00;
        call.gross = 21000.00;
        call.conveyanceAlw = 1000.00;
    }
    void SalaryCal()
    {
        SalaryCalculation obj = new SalaryCalculation();
        obj.pf = (8.33)/100 * basicPay;
        obj.netSalary = gross-pf;
        obj.annualSal = 12* obj.netSalary;
    }
    void Display()
    {
        SalaryCalculation ca = new SalaryCalculation();
        SalaryCal();
        giveValues();
        System.out.println(ca.annualSal);

    }

    public static void main() {
            SalaryCalculation ob = new SalaryCalculation();
            ob.Display();
        }
}