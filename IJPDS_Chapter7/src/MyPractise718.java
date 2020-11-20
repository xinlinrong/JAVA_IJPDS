/**
 * ¡∑œ∞ 7.18: √∞≈›≈≈–Ú
 */
public class MyPractise718 extends AbstractPratiseImpl {

	/**
	 * ≤‚ ‘ ˝æ›
	 * 2.1 1.0 3 5 9 8 13 22 17.6 22.3
	 */
	
	/**
	 *  π”√√∞≈›≈≈–Ú
	 * @param list
	 */
	public void bubbleSort(double [] list)
	{
		for (int i = 0; i < list.length; ++ i) {
			for (int j = i + 1; j < list.length; ++ j) {
				if (list[i] > list[j]) {
					double temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}

        for (int i = 0; i < list.length; ++ i) {
        	printFormat("%f ", list[i]);
        }
        printLine("");
	}
	
	@Override
	public void run()
	{
		printLine("Enter number n:");
		int n = in.nextInt();
		double[] numbers = new double[n];
        printFormatLine("Enter %d numbers", n);
        for (int i = 0; i < n; ++ i) {
        	numbers[i] = in.nextDouble();
        }
        bubbleSort(numbers);
	}
}
