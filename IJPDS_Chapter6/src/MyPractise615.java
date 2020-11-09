/**
 * 练习6.15: 金融应用, 打印税表 
 * @author integrate
 */
public class MyPractise615 extends AbstractPratiseImpl {

	
	/**
	 * 计算税率
	 * @param status
	 * @param taxableIncome
	 * @return
	 */
	public static double computeTax(int status, double taxableIncome)
	{
		UsaTaxBaseCompute $taxObject = null;
		switch (status) {
			case 1:
				$taxObject = new UsaTaxSingleCompute();
				break;
			case 2:
				$taxObject = new UsaTaxMarriedJointCompute();
				break;
			case 3:
				$taxObject = new UsaTaxMarriedSeparateCompute();
				break;
			case 4:
				$taxObject = new UsaTaxHouseHoldCompute();
				break;
		}
		return $taxObject.getTotalTaxAmount(taxableIncome);
	}
	
	@Override
	public void run()
	{
		double printTaxableIncome = 50000, incrementTaxableIncome = 50;
		do {
			print("%-15.0f%-15d%-15d%-15d%-15d", printTaxableIncome, 
					Math.round(computeTax(1, printTaxableIncome)), Math.round(computeTax(2, printTaxableIncome)),
					Math.round(computeTax(3, printTaxableIncome)), Math.round(computeTax(4, printTaxableIncome)));
			printTaxableIncome += incrementTaxableIncome;
		} while (printTaxableIncome <= 60000);
	}
}
