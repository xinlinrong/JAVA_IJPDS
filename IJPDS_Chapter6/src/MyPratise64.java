
public class MyPratise64 extends AbstractPratiseImpl {

	public final static int THIS_DIVISOR = 10;
	
	/**
	 * 练习: 6.4 反序显示一个整数
	 * @param number
	 * @return
	 */
	public static int reverse(int number)
	{
		int sumDigitResult = 0, remainResult = number;
        while (remainResult > 0) {
        	sumDigitResult = sumDigitResult * 10 + remainResult % THIS_DIVISOR;
        	remainResult = remainResult / THIS_DIVISOR;
        }

        return sumDigitResult;
	}
	
	@Override
    public void run()
    {
		print("Enter a number:");
        print("The result is %d", reverse(in.nextInt()));
        
    }
}
