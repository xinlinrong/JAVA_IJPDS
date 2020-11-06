/**
 * 练习: 6.7 金融应用: 计算未来投资回报值
 * @author integrate
 */
public class MyPractise67 extends AbstractPratiseImpl {

	public final static int YEARS = 30;
	
	/**
	 * 计算未来投资回报率
	 * @param investmentAmount
	 * @param monthlyInterestRate
	 * @param years
	 * @return
	 */
	public static double futureInvestmentValue(
		double investmentAmount,
		double monthlyInterestRate,
		int years
	)
	{
		return investmentAmount * Math.pow((1 + monthlyInterestRate), 12 * years);
	}
	
	@Override
    public void run()
    {
		print("The amount invested:");
		double amount = in.nextDouble();
		print("Annual interest rate:");
		double annual = in.nextDouble();
		print("%-10s%10s", "Years", "Feature Value");
		
		for (int i = 1; i <= YEARS; ++ i) {
			print("%-10d%10.2f", i, futureInvestmentValue(amount, annual/1200.0, i));
		}
    }
}
