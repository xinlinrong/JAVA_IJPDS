
public class MyPratise62 extends AbstractPratiseImpl {

	public final static int THIS_DIVISOR = 10;
	
	/**
	 * ��ϰ: 6.2 ��һ��������λ����֮��
	 * @param number
	 * @return
	 */
	public static int sumDigits(int number)
	{
		int sumDigitResult = 0, remainResult = number;
        while (remainResult > 0) {
        	sumDigitResult += remainResult % THIS_DIVISOR;
        	remainResult = remainResult / THIS_DIVISOR;
        }

        return sumDigitResult;
	}
	
	@Override
    public void run()
    {
		print("Enter a number:");
        print("Result sumDigits is %d", sumDigits(in.nextInt()));
    }
}
