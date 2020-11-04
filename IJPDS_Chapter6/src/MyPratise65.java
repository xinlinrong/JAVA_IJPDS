
public class MyPratise65 extends AbstractPratiseImpl {

	public final static int THIS_DIVISOR = 10;
	
	/**
	 * 练习: 6.4 反序显示一个整数
	 * @param number
	 * @return
	 */
	public static void dispalySortedNumbers(double num1, double num2, double num3)
	{
		double num1Digit, num2Digit, num3Digit;
		num1Digit = Math.min(num1, Math.min(num2, num3));
		num3Digit = Math.max(num1, Math.max(num2, num3));
		num2Digit = Math.min(Math.max(num1, num2), Math.max(num2, num3));
		System.out.printf("The number serial is %f, %f, %f\n", num1Digit, num2Digit, num3Digit);
	}
	
	@Override
    public void run()
    {
		print("Enter data num1:");
		int num1 = in.nextInt();
		print("Enter data num2:");
		int num2 = in.nextInt();
		print("Enter data num3:");
		int num3 = in.nextInt();
		dispalySortedNumbers(num1, num2, num3);       
    }
}
