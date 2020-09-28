import java.util.Scanner;

public class MyPratise26 implements IPratise {
	
	public final int MIN = 0;
	public final int MAX = 1000;
	
	/**
	 * 求整数各位数之和
	 * @param min
	 * @param max
	 * @return
	 */
	protected int calcSumOfEachDigit(int digit)
	{
		int result = 0;
		int copyOfDigit = digit;
		do {
			result += copyOfDigit % 10;
			copyOfDigit = copyOfDigit / 10;
		} while (copyOfDigit>0);
	    return result;
	}
	
	/**
	 * 求一个整数各位数之和
	 */
	public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.printf("Enter a number between %d and %d:", MIN, MAX);
    	System.out.printf("The sun of digits is %d\n", calcSumOfEachDigit(in.nextInt()));
    	in.close();
    }
}
