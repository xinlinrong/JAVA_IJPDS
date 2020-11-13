/**
 * 该单元数学统计类
 * @author integrate
 */
public class MathUtils {
	/**
	 * 检查是否是素数
	 * @param i
	 * @return boolean
	 */
	public static boolean isPrime(long number)
	{
		boolean isPrime = true;
        for (long i = 2; i <= number/2; ++ i) {
        	if (number % i == 0) {
        		isPrime = false;
        		break;
        	}
        }
		return isPrime;
	}

	/**
	 * 检查数字是否是回文
	 * @param number
	 * @return boolean
	 */
    public static boolean isPalindrome(long number)
    {
    	long calcNumber = 0;
    	long restNumber = number;
        do {
        	calcNumber = calcNumber * 10 + restNumber % 10;
        	restNumber = restNumber / 10;
        } while (restNumber !=0 );
        	
        return (calcNumber == number);
    }

    /**
     * 获取一个值的反转
     * @param number
     * @return
     */
    public static long reverse(long number) {
    	long calcNumber = 0;
    	long restNumber = number;
        do {
        	calcNumber = calcNumber * 10 + restNumber % 10;
        	restNumber = restNumber / 10;
        } while (restNumber !=0 );
        return calcNumber;
    }

   /**
    * 生成随机数
    * @param maxOne
    * @return
    */
    public static int randInt(int  maxOne)
    {
    	return (int) (Math.random() * (1 + maxOne));
    }

    /**
     * 计算正  n 边形的面积
     * @param n
     * @param side
     * @return
     */
    public static double nPolygonArea(int n, double side)
    {
    	return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n));
    }
}