/**
 * 练习6.26: 回文素数认定
 * @author integrate
 */
public class MyPractise626 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		int numCount = 0;
		int rowColumns = 0;
		long number = 2;
        while (numCount < 100) {
        	if (MathUtils.isPrime(number) && MathUtils.isPalindrome(number)) {
        		++ numCount;
        		++ rowColumns;
                if (rowColumns == 10) {
                	System.out.printf("%d\n", number);
                	rowColumns = 0;
                } else {
                	System.out.printf("%d ", number);
                }
        	}
        	++ number;
        }
    }
}
