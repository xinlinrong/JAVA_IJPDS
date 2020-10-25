/**
 * 练习 5.21: 金融应用,显示分期还贷时间表
 * @author integrate
 */
public class MyPratise522 extends AbstractPratiseImpl {
	/**
	 * 通过借入金额, 利率计算总金额
	 * @param loanAmount
	 * @param rate
	 * @param year
	 * @return
	 */
	private void calcLoanByRateAndAmount(double loanAmount, double rate, int year)
	{
		double monthlyPayment = 0.0;
        double totalPayment = 0.0f;
        double monthRate = rate / 1200.0;
        
        // 计算月支付额度
        monthlyPayment = (loanAmount * monthRate) / (1 - (1 / Math.pow(1+monthRate, year * 12)));
        totalPayment = monthlyPayment * year * 12;

        print("Monthly Payment: %.2f", monthlyPayment);
        print("Total Payment: %.2f", totalPayment);

        double interest = 0.0f, principal = 0.0f, balance = 10000.0f;
        print("%-20s%-20s%-20s%-20s", "Payment#", "Interest", "Principal", "Balance");   
        for (int i = 1; i <= (year * 12); ++ i) {
        	interest = monthRate * balance;
        	principal = monthlyPayment - interest;
            balance = balance - principal;
        	print("%-20d%-20.2f%-20.2f%-20.2fs", i, interest, principal, balance);        	
        }
	}

	@Override
    public void run()
    {
		print("Loan Amount:");
		double loanAmount = in.nextDouble();
        print("Number of years:");
        int years = in.nextInt();
        print("Annual Interest Rate:");
        double rate = in.nextDouble();

        calcLoanByRateAndAmount(loanAmount, rate, years);
    }
}
