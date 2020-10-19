/**
 * 练习 5.7: 金融应用: 计算将来的学费
 * @author integrate
 */
public class MyPratise57  extends AbstractPratiseImpl  {
	public final double BASE_AMOUNT = 10000.0;
	public final double FIXED_RATE = 0.05;

	/**
	 * 计算学费
	 * @param baseAmount
	 * @param rate
	 * @param years
	 * @return
	 */
	public double calcTotalAmountByYear(
		double baseAmount,
		double rate,
		int years
	)
	{
		return Math.pow((1 + rate), years) * baseAmount;
	}
	
	@Override
    public void run()
    {
		// 计算 10 年后的学费总额
        double calcAmount = calcTotalAmountByYear(BASE_AMOUNT, FIXED_RATE, 10);
        this.print("Amount you should pay is $%.2f", calcAmount);
         for (int i = 1; i < 5; ++i) {
        	 calcAmount = calcTotalAmountByYear(calcAmount, FIXED_RATE, 1);
        	 this.print("You shoule pay $%.2f after %d year", calcAmount, 1);
         }
    }
}
