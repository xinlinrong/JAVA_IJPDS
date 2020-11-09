/**
 * 计算税率接口
 * @author integrate
 */
public interface IUsaTaxCompute {
	
	/**
	 * 获取最高税率
	 * @param taxableIncome
	 * @return
	 */
	public int getMaxTaxLevel(double taxableIncome);

	/**
	 * 获取应缴纳的税金
	 * @param taxableIncome
	 * @return
	 */
    public double getTotalTaxAmount(double taxableIncome);

    /**
     * 根据等级获取对应的边界收入
     * @param incomeLevel
     * @return
     */
    public double getTaxableIncomeLevel(int incomeLevel);
}