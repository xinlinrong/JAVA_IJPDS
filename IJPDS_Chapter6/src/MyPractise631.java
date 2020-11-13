import java.lang.IllegalArgumentException;

/**
 * ��ϰ6.31: ����Ӧ��, ���ÿ��ĺϷ�����֤
 * @author integrate
 */
public class MyPractise631 extends AbstractPratiseImpl {

	/**
	 * ��֤�Ƿ���Ч
	 * @param number
	 * @return
	 */
	public static boolean isValid(long number)
	{
		// �������ֳ��� 13 - 16 λ
		if (getSize(number) < 13 || getSize(number) > 16) {
			return false;
		}

		// ����ǰ׺
		if (!prefixMatched(number, 37) && !prefixMatched(number, 4)
		&& !prefixMatched(number, 5) && !prefixMatched(number, 6)) {
			return false;
		}

		int sumOfEven = sumOfDoubleEvenPlace(number);
		int sumOfOdd = sumOfOddPlace(number);
		
		return ((sumOfEven + sumOfOdd) % 10 == 0);
	}
	
	/**
	 * ����ż��λ�ĺ�
	 * @param number
	 * @return
	 */
	public static int sumOfDoubleEvenPlace(long number)
	{
		int sum = 0;
        long restNumber = number;
        while (restNumber > 0) {
        	int evenNumber = (int)((restNumber % 100) / 10);
        	sum +=  getDigit(evenNumber * 2);
        	restNumber = restNumber / 100;
        }
        return sum;
	}
	
	/**
	 * ���㵥����������������֮��
	 * @param number
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static int getDigit(int number) throws IllegalArgumentException
	{
		int digit = 0;
        if (number >= 100) {
        	throw new IllegalArgumentException("argument number must between 0 - 99");
        }

        if (number < 10) {
        	digit = number;
        } else {
        	digit = (number / 10) + (number % 10);
        }

        return digit;
	}
	
	/**
	 * ��������λ�ĺ�
	 * @param number
	 * @return
	 */
	public static int sumOfOddPlace(long number)
	{
		int sum = 0;
        long restNumber = number;
        while (restNumber>0) {
        	sum +=  restNumber % 10;
        	restNumber = restNumber / 100;
        }
        return sum;
	}
	
	/**
	 * ������λ�����Ƿ����ض��ķ����̴��������
	 * @param number ��������
	 * @param d ǰ׺����
	 * @return
	 */
	public static boolean prefixMatched(long number, int d)
	{
        long firstKPrefix = getPrefix(number, d);
        return (firstKPrefix == d);
	}
	
	/**
	 * ��ȡ���ֵĳ���
	 * @param d
	 * @return
	 */
	public static int getSize(long d)
	{
		long restVal = d;
		int numberOfDigit = 0;
		do {
			restVal = restVal/10;
			++ numberOfDigit;
		} while (restVal>0);
		return numberOfDigit;
	}
	
	/**
	 * ��ȡǰ�� k ������
	 * @param number
	 * @param k
	 * @return
	 */
	public static long getPrefix(long number, int k)
	{
		long prefixDigit = 0;
		if (getSize(number) > getSize(k)) {
        	prefixDigit = number / ((long) Math.pow(10, getSize(number) - getSize(k)));
        } else {
        	prefixDigit = number;
        }
		return prefixDigit;
	}
	
	@Override
    public void run()
    {
		// test data 1: 4388576018410707
		// test data 2: 4388576018402626
		print("Enter a credit card number as a long integer:");
		long number = in.nextLong();
        if (isValid(number)) {
        	print("%d is valid", number);
        } else {
        	print("%d is invalid", number);
        }
    }
}
