/**
 * 练习 5.29: 金融应用. 复利值
 * @author integrate
 */
public class MyPratise530 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		// 输入初始以及每月存入余额
		print("Enter the initial deposit amount:");
        double amtPerMonth = in.nextDouble();
        
        // 输入利率
        print("Enter annual percentage yield:");
        double annual = in.nextDouble();

        // 输入存入的月数
        print("Enter maturity period (number of months):");
        int months = in.nextInt();

	    double balance = 0.0;
        double ratePerMonth = annual / 1200.0;
        for (int i = 1; i <= months; ++ i) {
        	balance = (100 + balance) * (1.0 + ratePerMonth);
        }

	    print("After %d months, your account balance is %.3f", months, balance);
	}
}
