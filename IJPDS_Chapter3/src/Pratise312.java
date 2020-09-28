public class Pratise312 extends AbstractPratiseImpl {

	/**
	 * 判断三位数字是否是回文
	 * @param number
	 * @return boolean
	 */
	private boolean isPalindrome(int number)
	{
		return ((number/100) == (number%10));
	}
	
	@Override
    public void run()
    {
    	print("Enter a three digit integer (100 - 999):");
        int number = in.nextInt();
        if (isPalindrome(number)) {
        	print("%d is a palindrome", number);
        } else {
        	print("%d is not a palindrome", number);
        }
    }
}
