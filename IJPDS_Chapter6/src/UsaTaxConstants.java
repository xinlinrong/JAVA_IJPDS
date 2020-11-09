/**
 * ����˰�ʵȼ�
 * @author integrate
 */
public class UsaTaxConstants {

	// ��һ�ȼ�˰��
	public final static int TAX_LEVEL1 = 1;
	private final static double TAX_RATE_LEVEL1 = 0.10;
	
	// �ڶ��ȼ�˰��
	public final static int TAX_LEVEL2 = 2;
	private final static double TAX_RATE_LEVEL2 = 0.15;
	
	// �����ȼ�˰��
	public final static int TAX_LEVEL3 = 3;
	private final static double TAX_RATE_LEVEL3 = 0.25;

	// ���ĵȼ�˰��
	public final static int TAX_LEVEL4 = 4;
	private final static double TAX_RATE_LEVEL4 = 0.28;
	
	// ����ȼ�˰��
	public final static int TAX_LEVEL5 = 5;
	private final static double TAX_RATE_LEVEL5 = 0.33;
	
	// �����ȼ�˰��
	public final static int TAX_LEVEL6 = 6;
	private final static double TAX_RATE_LEVEL6 = 0.35;

	/**
	 * ����˰�ʵȼ���ȡ���˰��
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