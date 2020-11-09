/**
 * 已婚税率计算标准
 * @author integrate
 */
public class UsaTaxMarriedJointCompute extends UsaTaxBaseCompute {

	public final static double TAXABLE_INCOME_LEVEL1 = 16700;
	public final static double TAXABLE_INCOME_LEVEL2 = 67900;
	public final static double TAXABLE_INCOME_LEVEL3 = 137050;
	public final static double TAXABLE_INCOME_LEVEL4 = 208850; 
	public final static double TAXABLE_INCOME_LEVEL5 = 372950;

    /**
     * 根据等级获取对应的边界收入
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