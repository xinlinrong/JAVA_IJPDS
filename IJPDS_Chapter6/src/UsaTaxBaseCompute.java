
public class UsaTaxBaseCompute implements IUsaTaxCompute {

	public final static double TAXABLE_INCOME_LEVEL1 = 0;
	public final static double TAXABLE_INCOME_LEVEL2 = 0;
	public final static double TAXABLE_INCOME_LEVEL3 = 0;
	public final static double TAXABLE_INCOME_LEVEL4 = 0; 
	public final static double TAXABLE_INCOME_LEVEL5 = 0;
	
	/**
	 * 获取最高税率
	 * @param taxableIncome
	 * @return
	 */
	public int getMaxTaxLevel(double taxableIncome)
	{
		int taxLevel = UsaTaxConstants.TAX_LEVEL1;
		if (taxableIncome >  getTaxableIncomeLevel(5)) {
			taxLevel = UsaTaxConstants.TAX_LEVEL6;
		} else if (taxableIncome >  getTaxableIncomeLevel(4)) {
			taxLevel = UsaTaxConstants.TAX_LEVEL5;
		} else if (taxableIncome >  getTaxableIncomeLevel(3)) {
			taxLevel = UsaTaxConstants.TAX_LEVEL4;
		} else if (taxableIncome >  getTaxableIncomeLevel(2)) {
			taxLevel = UsaTaxConstants.TAX_LEVEL3;
		} else if (taxableIncome >  getTaxableIncomeLevel(1)) {
			taxLevel = UsaTaxConstants.TAX_LEVEL2;
		} else {
			taxLevel = UsaTaxConstants.TAX_LEVEL1;
		}
		return taxLevel;
	}

    /**
     * 根据等级获取对应的边界收入
     * @param incomeLevel
     * @return
     */
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
    
	/**
	 * 获取应缴纳的税金
	 * @param taxableIncome
	 * @return
	 */
    public double getTotalTaxAmount(double taxableIncome)
    {
    	double totalTaxAmount = 0.0;
    	int taxLevel = getMaxTaxLevel(taxableIncome);
    	switch (taxLevel) {
	    	case UsaTaxConstants.TAX_LEVEL1:
	    		totalTaxAmount += taxableIncome * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL1);
	    		break;
	    	case UsaTaxConstants.TAX_LEVEL2:
	    		totalTaxAmount += getTaxableIncomeLevel(1) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL1);
	    		totalTaxAmount += (taxableIncome - getTaxableIncomeLevel(1)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL2);
	    		break;
	    	case UsaTaxConstants.TAX_LEVEL3:
	    		totalTaxAmount += getTaxableIncomeLevel(1) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL1);
	    		totalTaxAmount += (getTaxableIncomeLevel(2) - getTaxableIncomeLevel(1)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL2);
	    		totalTaxAmount += (taxableIncome - getTaxableIncomeLevel(2)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL3);
	    		break;
	    	case UsaTaxConstants.TAX_LEVEL4:
	    		totalTaxAmount += getTaxableIncomeLevel(1) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL1);
	    		totalTaxAmount += (getTaxableIncomeLevel(2) - getTaxableIncomeLevel(1)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL2);
	    		totalTaxAmount += (getTaxableIncomeLevel(3) - getTaxableIncomeLevel(2)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL3);
	    		totalTaxAmount += (taxableIncome - getTaxableIncomeLevel(3)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL4);
	    		break;
	    	case UsaTaxConstants.TAX_LEVEL5:
	    		totalTaxAmount += getTaxableIncomeLevel(1) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL1);
	    		totalTaxAmount += (getTaxableIncomeLevel(2) - getTaxableIncomeLevel(1)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL2);
	    		totalTaxAmount += (getTaxableIncomeLevel(3) - getTaxableIncomeLevel(2)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL3);
	    		totalTaxAmount += (getTaxableIncomeLevel(4) - getTaxableIncomeLevel(3)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL4);
	    		totalTaxAmount += (taxableIncome - getTaxableIncomeLevel(4)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL5);
	    		break;
	    	case UsaTaxConstants.TAX_LEVEL6:
	    		totalTaxAmount += getTaxableIncomeLevel(1) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL1);
	    		totalTaxAmount += (getTaxableIncomeLevel(2) - getTaxableIncomeLevel(1)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL2);
	    		totalTaxAmount += (getTaxableIncomeLevel(3) - getTaxableIncomeLevel(2)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL3);
	    		totalTaxAmount += (getTaxableIncomeLevel(4) - getTaxableIncomeLevel(3)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL4);
	    		totalTaxAmount += (getTaxableIncomeLevel(5) - getTaxableIncomeLevel(4)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL5);
	    		totalTaxAmount += (taxableIncome - getTaxableIncomeLevel(5)) * UsaTaxConstants.getTaxRateByTaxLevel(UsaTaxConstants.TAX_LEVEL6);
	    		break;
    	}
    	return totalTaxAmount;
    }
}