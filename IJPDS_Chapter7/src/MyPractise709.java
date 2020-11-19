/**
 * 练习 7.9: 找出最小元素
 */
public class MyPractise709 extends AbstractPratiseImpl {

	public static double min(double[] array)
	{
		double min = array[0];
		for (int i = 0; i < array.length; ++i) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	@Override
	public void run()
	{
		printLine("Enter 10 number:");
		double[] array = new double[10];
		for (int i = 0; i < array.length; ++ i) {
			array[i] = in.nextDouble();
		}
		printFormatLine("The minimum number is %f", min(array));
	}
}
