/**
 * ��ϰ 7.20: �޸�ѡ������
 */
public class MyPractise720 extends AbstractPratiseImpl {

	/**
	 * ��������
	 * 1 9 4.5 6.6 5.7 -4.5
	 */
	
	/**
	 * ѡ������
	 * @param list
	 * @return
	 */
	public void selectionSort(double[] list)
	{
		for (int i = list.length - 1; i >= 0; --i) {
			int currentIndex = i;
			double maxValue = list[i];
			for (int j = 0; j <= i - 1; ++j) {
				if (list[j] > maxValue) {
					currentIndex = j;
					maxValue = list[j];
				}
			}
			// ����
            if (currentIndex != i) {
            	list[currentIndex] = list[i]; // ���һλ���
            	list[i] = maxValue;
            }
		}
		
		printLine("The sorted list is:");
		for (int i = 0; i < list.length; ++ i) {
			printFormat("%.1f ", list[i]);
		}
		printLine("");
		return;
	}
	
	@Override
	public void run()
	{
		printLine("Enter the size of the list:");
		int size = in.nextInt();
        double[] list = new double[size];
        printLine("Enter the content of the list:");
        for (int i = 0; i < list.length; ++ i) {
        	list[i] = in.nextDouble();
        }
        selectionSort(list);
	}
}
