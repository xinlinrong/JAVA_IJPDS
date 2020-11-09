/**
 * ��ͥ������˰��˰�ʼ����׼
 * @author integrate
 */
public class UsaTaxHouseHoldCompute extends UsaTaxBaseCompute {

	public final static double TAXABLE_INCOME_LEVEL1 = 11950;
	public final static double TAXABLE_INCOME_LEVEL2 = 45500;
	public final static double TAXABLE_INCOME_LEVEL3 = 117450;
	public final static double TAXABLE_INCOME_LEVEL4 = 190200; 
	public final static double TAXABLE_INCOME_LEVEL5 = 372950;

    /**
     * ���ݵȼ���ȡ��Ӧ�ı߽�����
     * @param incomeLevel
     * @return
     */
	@Override
    public double getTaxableIncomeLevel(int incomeLevel)
    {
    	double taxableIncome = 0.0;
    	switch (incomeLevel) {
    	    case 1: taxableIncome = TAXABLE_INCOME_LEVEL1; break;
    	    case 2: taxableIncome = TAXABLE_INCOME_LEVEL2; break;
    	    case 3: taxableIncome = TAXABLE_INCOME_LEVEL3; break;
    	    case 4: taxableIncome = TAXABLE_INCOME_LEVEL4; break;
    	    case 5: taxableIncome = TAXABLE_INCOME_LEVEL5; break;
    	}
    	return taxableIncome;
    }
}