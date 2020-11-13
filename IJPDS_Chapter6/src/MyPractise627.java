/**
 * Á·Ï°6.27: ·´ËØÊı
 * @author integrate
 */
public class MyPractise627 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		int numCount = 0;
		int rowColumns = 0;
		long number = 2;
        while (numCount < 100) {
        	if (!MathUtils.isPalindrome(number)) {
	        	if (MathUtils.isPrime(number) && MathUtils.isPrime(MathUtils.reverse(number))) {
	        		++ numCount;
	        		++ rowColumns;
	                if (rowColumns == 10) {
	                	System.out.printf("%d\n", number);
	                	rowColumns = 0;
	                } else {
	                	System.out.printf("%d ", number);
	                }
	        	}
        	}
        	++ number;
        }
    }
}
