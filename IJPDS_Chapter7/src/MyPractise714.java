import java.lang.IllegalArgumentException;

/**
 * 练习 7.14: 计算数组的 gcd 最大公约数
 */
public class MyPractise714 extends AbstractPratiseImpl {

	/**
	 * 计算数组的最大 gcd
	 * @param numbers
	 * @return
	 */
	public static int gcd(int ...numbers)
	{
		int minOne = 0;
		if (numbers.length <= 1) {
		    throw new IllegalArgumentException("Argument number length must be greater than 1");
		}

        // 首先计算出最小的数字
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
		    // 获取到最大的 gcd 值
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
