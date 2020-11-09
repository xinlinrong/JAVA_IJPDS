/**
 * ��ϰ6.11: ����Ӧ�� ������
 * @author integrate
 */
public class MyPractise611 extends AbstractPratiseImpl {

	public static final double COMMISSION_RATE_LEVEL1 = 0.08;
	public static final double COMMISSION_RATE_LEVEL2 = 0.10;
	public static final double COMMISSION_RATE_LEVEL3 = 0.12;
	
	/**
	 * ������Ĺ�ʽ
	 * @param salesAmount
	 * @return double
	 */
	public static double computeCommission(double salesAmount)
	{
		double commission = 0.0;

		if (salesAmount <= 5000) {
			commission = salesAmount * COMMISSION_RATE_LEVEL1;
		} else if (salesAmount <= 10000) {
			commission += 5000 * COMMISSION_RATE_LEVEL1;
			commission += (salesAmount - 5000) * COMMISSION_RATE_LEVEL2;
		} else {
			commission += 5000 * COMMISSION_RATE_LEVEL1;
			commission += (5000) * COMMISSION_RATE_LEVEL2;
			commission += (salesAmount - 10000) * COMMISSION_RATE_LEVEL3;
		}
		
		return commission;
	}
	
	@Override
	public void run()
	{
		// ��ӡ���۳���б�
        double printSaleAmount = 10000.0, incrementSalesAmount = 5000;
        print("%-43s%-43s", "�����ܶ�", "���");
        print("______________________");
        do {
        	double printCommission =computeCommission(printSaleAmount);
        	print("%-15.0f%-15.1f", printSaleAmount, printCommission);
        	printSaleAmount += incrementSalesAmount;
        } while (printSaleAmount <= 100000);
	}
}
