/**
 * 美国税率等级
 * @author integrate
 */
public class UsaTaxConstants {

	// 第一等级税率
	public final static int TAX_LEVEL1 = 1;
	private final static double TAX_RATE_LEVEL1 = 0.10;
	
	// 第二等级税率
	public final static int TAX_LEVEL2 = 2;
	private final static double TAX_RATE_LEVEL2 = 0.15;
	
	// 第三等级税率
	public final static int TAX_LEVEL3 = 3;
	private final static double TAX_RATE_LEVEL3 = 0.25;

	// 第四等级税率
	public final static int TAX_LEVEL4 = 4;
	private final static double TAX_RATE_LEVEL4 = 0.28;
	
	// 第五等级税率
	public final static int TAX_LEVEL5 = 5;
	private final static double TAX_RATE_LEVEL5 = 0.33;
	
	// 第六等级税率
	public final static int TAX_LEVEL6 = 6;
	private final static double TAX_RATE_LEVEL6 = 0.35;

	/**
	 * 根据税率等级获取最高税率
	 * @param taxLevel
	 */
    public static double getTaxRateByTaxLevel(int taxLevel)
    {
    	double taxRate = 0.0;
    	switch (taxLevel) {
    	    case TAX_LEVEL1: taxRate = TAX_RATE_LEVEL1; break;
    	    case TAX_LEVEL2: taxRate = TAX_RATE_LEVEL2; break;
    	    case TAX_LEVEL3: taxRate = TAX_RATE_LEVEL3; break;
    	    case TAX_LEVEL4: taxRate = TAX_RATE_LEVEL4; break;
    	    case TAX_LEVEL5: taxRate = TAX_RATE_LEVEL5; break;
    	    case TAX_LEVEL6: taxRate = TAX_RATE_LEVEL6; break;
    	}
    	return taxRate;
    }
}