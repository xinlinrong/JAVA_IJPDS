/**
 * 练习 5.29: 金融应用. 计算CD价值
 * @author integrate
 */
public class MyPratise531 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		// 输入初始以及每月存入余额
		print("Enter the initial deposit amount:");
        double depositAmt = in.nextDouble();
        
        // 输入利率
        print("Enter annual percentage yield:");
        double annual = in.nextDouble();

        // 输入存入的月数
        print("Enter maturity period (number of months):");
        int months = in.nextInt();

        double ratePerMonth = annual / 1200.0;
        print("%-10s%-10s", "Month", "CD Value");
        for (int i = 1; i <= months; ++ i) {
        	depositAmt = (depositAmt) * (1.0 + ratePerMonth);
            print("%-10d%-10.2f", i, depositAmt);
        }
	}
}
