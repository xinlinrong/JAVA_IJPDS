/**
 * 检查是否是素数
 * @author integrate
 */
public class PrimeChecker {
	/**
	 * 检查是否是素数
	 * @param i
	 * @return boolean
	 */
	public static boolean isPrime(int number)
	{
		boolean isPrime = true;
        for (int i = 2; i < number/2; ++ i) {
        	if (number % i == 0) {
        		isPrime = false;
        		break;
        	}
        }
		return isPrime;
	}
}
