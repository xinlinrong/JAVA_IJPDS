/**
 * 练习 7.12: 倒置数组
 */
public class MyPractise712 extends AbstractPratiseImpl {

	/**
	 * 倒置数组
	 * @param x
	 * @return
	 */
	public static double[] reverse(double[] x)
	{
		for (int i = 0; i < x.length/2; ++ i) {
			x[i] =  x[x.length - i - 1];
		}
		return x;
	}
	
	@Override
	public void run()
	{
		printLine("Enter number n:");
		int n = in.nextInt();
		printFormat("Enter %d number:", n);
		double[] x = new double[n];
		for (int i = 0; i < x.length; ++ i) {
			x[i] = in.nextDouble();
		}
		reverse(x);
		print("Reverse list is: ");
		for (int i = 0; i < x.length; ++i) {
			printFormat("%2.0f", x[i]);
		}
		printLine("");
	}
}
