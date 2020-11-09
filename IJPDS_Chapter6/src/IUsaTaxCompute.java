/**
 * ����˰�ʽӿ�
 * @author integrate
 */
public interface IUsaTaxCompute {
	
	/**
	 * ��ȡ���˰��
	 * @param taxableIncome
	 * @return
	 */
	public int getMaxTaxLevel(double taxableIncome);

	/**
	 * ��ȡӦ���ɵ�˰��
	 * @param taxableIncome
	 * @return
	 */
    public double getTotalTaxAmount(double taxableIncome);

    /**
     * ���ݵȼ���ȡ��Ӧ�ı߽�����
     * @param incomeLevel
     * @return
     */
    public double getTaxableIncomeLevel(int incomeLevel);
}