/**
 * 练习 5.16: 找出一个整数的因子
 * @author integrate
 */
public class MyPratise516 extends AbstractPratiseImpl {
	/**
	 * 获取最小的因子
	 * @param number
	 * @return
	 */
    private int getMinFactor(int number)
    {
    	int factor = 2;
        while (number % factor != 0) {
        	++factor;
        }
        return factor;
    }

	@Override
    public void run()
    {
    	int minFactor = 1, number = -1;
		this.print("Enter an integer:");
    	number = in.nextInt();

    	while(number != 1) {
    		// 获取最小因子
    		minFactor = getMinFactor(number); 
    		number /= minFactor;
    		System.out.printf("%-2d", minFactor);
    	}
		System.out.printf("\n");
    }
}
