public class Pratise313 extends AbstractPratiseImpl {

	private final double[] taxRate = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
	private final double[] singleRange = {8350, 33950, 82250, 171550, 372950};
    private final double[] marriedRange = {16700, 67900, 137050, 208850, 372950};
    private final double[] marriedSeprateRange = {8350, 33950, 68525, 104425, 186475};
    private final double[] householdRange = {11950, 45500, 117450, 190200, 372950};
	
	/**
	 * 单身纳税人计算
	 * @param income
	 * @return double
	 */
	private double calcTax(int status, double income)
	{
		double tax = 0.0f;
		double unTaxAmount = income;
		double[] range = getRangeByFilingStatus(status);
		double[] falstTaxCalcRange = range.clone(); // 速算数组
		for (int i = falstTaxCalcRange.length - 1; i >=0 ; -- i) {
		    if (i > 0) {
		    	falstTaxCalcRange[i] = falstTaxCalcRange[i] - falstTaxCalcRange[i-1];
		    }
        }
        for (int i = 0; i < range.length; ++ i) {
		    falstTaxCalcRange[i] = falstTaxCalcRange[i] * taxRate[i];
        }

        double maxTaxRange = range[range.length - 1];
        if (income > maxTaxRange) {
        	for (int i = 0; i < falstTaxCalcRange.length; ++ i) {
        		tax += falstTaxCalcRange[i];
        	}
        	tax += (income - maxTaxRange) * (taxRate[taxRate.length - 1]);
        } else if (income < range[0]) {
        	tax += income * taxRate[0];
        } else {
            for (int i = 0; i < range.length; ++ i) {
            	if (income > range[i]) {
            		tax += falstTaxCalcRange[i];
            	} else {
            		tax += (income - range[i-1]) * taxRate[i];
                    break;
            	}
            }
        }
        return tax;
	}
	
	/**
	 * 根据婚姻状态获取对应的收入范围
	 * @param status
	 * @return
	 */
	private double[] getRangeByFilingStatus(int status)
	{
		double[] returnRange = {};
		switch (status) {
		    case 0:
		    	returnRange = singleRange.clone();
		    	break;
		    case 1:
		    	returnRange = marriedRange.clone();
		    	break;
		    case 2:
		    	returnRange = marriedSeprateRange.clone();
		    	break;
		    case 3:
		    	returnRange = householdRange.clone();
		    	break;
		}
		return returnRange;
	}
	
	/**
	 * 金融应用: 计算税款
	 */
	@Override
    public void run()
    {
    	print("(0-single filter, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of houselold)");
    	print("Enter the filing status:");
    	int filingStatus = in.nextInt();

        print("Enter the taxable income: ");
        double income = in.nextDouble();

        double tax = 0.0f;
        switch (filingStatus) {
            case 0:
            case 1:
            case 2:
            case 3:
            	tax = calcTax(filingStatus, income);
                break;
            default:
                print("invalid filing status");
                System.exit(-1);
        }

        print("Tax is %.2f", tax);
        return;
    }
}
