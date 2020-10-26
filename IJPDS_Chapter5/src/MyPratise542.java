/**
 * 练习 5.42: 金融应用, 求销售总额
 * @author integrate
 */
public class MyPratise542 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		double salary = 0.0, saleAmount = 10000.0;
        do {
        	salary = 5000.0 + 0.08 * 5000 + 0.10 * 5000 + (saleAmount - 10000) * 0.12;
        	saleAmount ++;
        } while ((salary < 30000));
        
        print("The min saleAmount is $%.2f", saleAmount);
	}
}
