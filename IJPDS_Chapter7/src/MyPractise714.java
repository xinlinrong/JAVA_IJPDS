import java.lang.IllegalArgumentException;

/**
 * ��ϰ 7.14: ��������� gcd ���Լ��
 */
public class MyPractise714 extends AbstractPratiseImpl {

	/**
	 * ������������ gcd
	 * @param numbers
	 * @return
	 */
	public static int gcd(int ...numbers)
	{
		int minOne = 0;
		if (numbers.length <= 1) {
		    throw new IllegalArgumentException("Argument number length must be greater than 1");
		}

        // ���ȼ������С������
		minOne = numbers[0];
	    for (int i = 1; i < numbers.length; ++ i) {
		    if (minOne > numbers[i]) {
			    minOne = numbers[i];
		    }
	    }

		int gcd = 1;
		for (int i = minOne; i >= 1; -- i) {
		    boolean modSuccess = true;
		    for (int j = 0; j < numbers.length; ++j) {
		        if (numbers[j] % i != 0) {
		    	    modSuccess = false;
		    	    break;
		        }
		    }
		    // ��ȡ������ gcd ֵ
		    if (modSuccess) {
			    gcd = i;
			    break;
		    }
		}
	    return gcd;
    }
	
	@Override
	public void run()
	{
		printLine("Enter the number n:");
		int n = in.nextInt();
        int[] numbers = new int[n];
        printFormatLine("Enter %d numbers:", n);
        for (int i = 0; i < numbers.length; ++ i) {
        	numbers[i] = in.nextInt();
        }
        printFormatLine("Array %s max gcd is %d", numbers.toString(), gcd(numbers));
	}
}
