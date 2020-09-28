import java.util.Scanner;

public class MyPratise221 implements IPratise {
	/**
	 * 金融应用: 计算投资回报
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter investment amount:");
    	double amount = in.nextDouble();
    	System.out.print("Enter annual interest rate in percentage:");
    	double annualInterestRate = in.nextDouble();
    	System.out.print("Enter number of years:");
    	int years = in.nextInt();
    	
    	double featureVal = amount * Math.pow(1+(annualInterestRate/1200), years * 12);
        System.out.printf("Feature value is $%.4f", featureVal);
        in.close();
    }
}
