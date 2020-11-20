import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * ��ϰ 7.16: ִ��ʱ��
 */
public class MyPractise716 extends AbstractPratiseImpl {

	/**
	 * ���β���
	 * @param list
	 * @param k
	 */
	public long doLinearSearch(int[] list, int k)
	{
		long startTime = System.nanoTime();
		for (int i = 0; i < list.length; ++ i) {
			if (list[i] == k) {
				break;
			}
		}
		long endTime = System.nanoTime();
		return (endTime - startTime);
	}

	/**
	 * ���ֲ���
	 * @param list
	 * @param k
	 */
	public long doBinarySearch(int[] list, int k)
	{
		Arrays.sort(list);
		long startTime = System.nanoTime();
		Arrays.binarySearch(list, k);
		long endTime = System.nanoTime();
		return (endTime - startTime);
	}
	
	/**
	 * ������� n ������
	 * @param n
	 * @return
	 */
	public int [] generateList(int n)
	{
		int[] list = new int[n];
		for (int i = 0; i < n; ++ i) {
			list[i] = genInteger(n);
		}
		return list;
	}
	
	/**
	 * ��������
	 * @param maxCount
	 * @return
	 */
	private int genInteger(int maxCount)
	{
		return (int) ((Math.random() * maxCount) + 1);
	}
	
	@Override
	public void run()
	{
		int[] list = generateList(100000);
		int key = genInteger(100000);

	    long linearSearchTime = doLinearSearch(list, key);
	    long binarySearchTime = doBinarySearch(list, key);
	    printFormatLine("Linear search time is %f", linearSearchTime / 1000000000.0);
	    printFormatLine("Binary search time is %f", binarySearchTime/ 1000000000.0);
	}
}
