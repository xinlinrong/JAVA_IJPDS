/**
 * 练习 7.11: 找出最小元素的下标
 */
public class MyPractise711 extends AbstractPratiseImpl {

	/**
	 * 返回标准差
	 * @return
	 */
	public static double devitation(double [] x)
	{
		double deviation = 0.0;
		double mean = mean(x);
		for (int i = 0; i < x.length; ++ i) {
        	deviation += Math.pow(x[i] - mean, 2);
        }
		deviation = deviation / (x.length - 1);
        return Math.sqrt(deviation);
	}

	/**
	 * 返回平均值
	 * @return
	 */
	public static double mean(double[] x)
	{
		double sum = 0.0;
        for (int i = 0; i < x.length; ++ i) {
        	sum += x[i];
        }
        return (sum / x.length);
	}
	
	@Override
	public void run()
	{
		printLine("Enter number n");
		int n = in.nextInt();
		double [] x = new double[n];
		printLine("Enter number:");
        for (int i = 0; i < x.length; ++ i) {
        	x[i] = in.nextDouble();
        }
        double mean = mean(x);
        double deviation = devitation(x);
        printFormatLine("The mean is %.5f", mean);
        printFormatLine("The standard deviation is %.5f", deviation);
	}
}
