/**
 * 练习 5.21: 金融应用,比较不同利率下的贷款
 * @author integrate
 */
public class MyPratise521 extends AbstractPratiseImpl {

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
        print("%-19.3f %-20.2f %-20.2f", rate, monthlyPayment, totalPayment);
	}
	
	@Override
    public void run()
    {
		print("Loan Amount:");
		double loanAmount = in.nextDouble();
        print("Number of years:");
        int years = in.nextInt();
		
        double rate = 5.0, delta = 0.125;
        print("%-20s%-20s%-20s", "Interest Rate", "Monthly Payment", "Total Payment");
        while (rate <= 8.000) {
        	calcLoanByRateAndAmount(loanAmount, rate, years);
        	rate += delta;
        }
    }
}
