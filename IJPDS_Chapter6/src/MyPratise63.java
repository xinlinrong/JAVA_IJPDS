
public class MyPratise63 extends AbstractPratiseImpl {

	public final static int THIS_DIVISOR = 10;
	
	/**
	 * 练习: 6.3 计算一个数的逆序数
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

	/**
	 * 计算是否是回文
	 * @param number
	 * @return
	 */
	public static boolean isPalindrome(int number)
	{
		return (number == reverse(number));
	}
	
	@Override
    public void run()
    {
		print("Enter a number:");
        int number = in.nextInt();
        if (isPalindrome(number)) {
        	print("Number %d is a palindrome!", number);
        } else {
        	print("Number %d is not a palindrome!", number);
        }
    }
}
