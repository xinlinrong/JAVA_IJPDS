/**
 * 练习 5.13: 找出n平方 > 12000 的 n 的最小值
 * @author integrate
 */
public class MyPratise513 extends AbstractPratiseImpl {

	private final int MAX_INTEGER = 12000;
	
	/**
	 * 计算 n 的立方
	 * @param n
	 * @return integer
	 */
	private int calcPow3(int n)
	{
		return (n * n * n);
	}
	
	@Override
    public void run()
    {
		int n = 1;
        while (calcPow3(n) < MAX_INTEGER) {
        	++ n;
        }
        print("Min n is %d", n - 1);
    }
}
