/**
 * 练习 5.39: 金融应用, 求销售总额
 * @author integrate
 */
public class MyPratise539 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		double salary = 0.0, saleAmount = 10000.0;
        while (salary < 30000) {
        	salary = 5000.0 + 0.08 * 5000 + 0.10 * 5000 + (saleAmount - 10000) * 0.12;
        	saleAmount ++;
        }
        
        print("The min saleAmount is $%.2f", saleAmount);
	}
}
