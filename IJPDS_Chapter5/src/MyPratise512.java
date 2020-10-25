/**
 * 练习 5.11: 找出n平方 > 12000 的 n 的最小值
 * @author integrate
 */
public class MyPratise512 extends AbstractPratiseImpl {

	private final int MAX_INTEGER = 12000;
	
	/**
	 * 计算 n 的平方
	 * @param n
	 * @return integer
	 */
	private int calcSqare(int n)
	{
		return (n * n);
	}
	
	@Override
    public void run()
    {
		int n = 1;
        while (calcSqare(n) < MAX_INTEGER) {
        	++ n;
        }
        print("Min n is %d", n);
    }
}
