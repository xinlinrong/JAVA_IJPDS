/**
 * 练习 5.20: 打印 2 - 1000 之间的素数
 * @author integrate
 */
public class MyPratise520 extends AbstractPratiseImpl {

	final public int COUNTER_WRAPPER = 8;
	
	/**
	 * 素数判断
	 * @param number
	 * @return boolean
	 */
	private boolean isPrime(int number)
	{
		boolean isPrime = true;
        for (int divisor = 2; divisor <= number/2; ++divisor) {
        	if (number % divisor == 0) {
        		isPrime = false;
        		break;
        	}
        }
        return isPrime;
	}
	
	@Override
    public void run()
    {
		int columnCounts = 0;
		for (int i = 2; i <= 1000; ++i) {
			if (isPrime(i)) {
				++ columnCounts;
                if (columnCounts % COUNTER_WRAPPER == 0) {
                	System.out.printf("%-4d\n", i);
                } else {
                	System.out.printf("%-4d", i);
                }
			}
		}
    }
}
