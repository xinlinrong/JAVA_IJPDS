/**
 * 练习 7.8: 求数组的平均值
 */
public class MyPractise708 extends AbstractPratiseImpl {

	public static int average(int[] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; ++i) {
			sum += array[i];
		}
		return (sum/array.length);
	}
	
	public static double average(double[] array)
	{
		double sum = 0.0;
		for (int i = 0; i < array.length; ++i) {
			sum += array[i];
		}
		return (sum/array.length);
	}
	
	@Override
	public void run()
	{
		printLine("Enter 10 number:");
		double[] array = new double[10];
		for (int i = 0; i < array.length; ++ i) {
			array[i] = in.nextDouble();
		}
		double average = average(array);
        printFormatLine("The average of array is %f", average);
	}
}
