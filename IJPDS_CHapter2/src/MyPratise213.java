import java.util.Scanner;

public class MyPratise213 implements IPratise {
    /**
     * 金融应用: 复利值
     */
	public void run()
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter the money save amount per month:");
        double amount = in.nextDouble();
        System.out.print("Enter the interest rate per year:");
        double interestRate = in.nextDouble();
        System.out.print("Enter the months you want to save:");
        int saveMonths = in.nextInt();

        double accountValue = 0.00;
        double interestRatePerMonth = interestRate / (12 * 100);
        for (int i = 0; i < saveMonths; ++ i) {
        	accountValue = (100 + accountValue) * (1 + interestRatePerMonth);
        }
        System.out.printf("After the %d months, the account value is %.2f", saveMonths, accountValue);
        in.close();
    }
}
