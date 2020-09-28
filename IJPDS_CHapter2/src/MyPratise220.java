import java.util.Scanner;

public class MyPratise220 implements IPratise {
	/**
	 * 金融应用: 计算利息
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%)");
        double balance = in.nextDouble();
        double annualInterestRate = in.nextDouble();
        annualInterestRate /= 1200;
        double interestNextMonth = balance * annualInterestRate;
        System.out.printf("The interest is %.4f", interestNextMonth);
        in.close();
    }
}
