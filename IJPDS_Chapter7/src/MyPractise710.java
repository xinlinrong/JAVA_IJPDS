/**
 * 练习 7.10: 找出最小元素的下标
 */
public class MyPractise710 extends AbstractPratiseImpl {
	/**
	 * 查找最小元素的下标
	 * @param array
	 * @return
	 */
	public static int indexOfSmallElement(double[] array)
	{
		int indexPos = 0;
		double min = array[0];
		for (int i = 0; i < array.length; ++i) {
			if (array[i] < min) {
				min = array[i];
				indexPos = i;
			}
		}
		return indexPos;
	}
	
	@Override
	public void run()
	{
		printLine("Enter 10 number:");
		double[] array = new double[10];
		for (int i = 0; i < array.length; ++ i) {
			array[i] = in.nextDouble();
		}
		printFormatLine("The minimum number position is %d", indexOfSmallElement(array));
	}
}
