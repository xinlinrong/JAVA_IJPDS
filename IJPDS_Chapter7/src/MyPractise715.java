import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * 练习 7.15: 消除重复
 */
public class MyPractise715 extends AbstractPratiseImpl {

	/**
	 * 消除重复
	 * @param list
	 * @return
	 */
	public static int[] eliminateDuplicates(int[] list)
	{
		int[] originalList = {}; 
		for (int i = 0; i < list.length; ++i) {
			boolean hasFind = false;
			for (int j = 0; j < originalList.length; ++ j) {
				if (list[i] == originalList[j]) {
					hasFind = true;
				}
			}
			if (!hasFind) {
				originalList = Arrays.copyOf(originalList, originalList.length + 1);
				originalList[originalList.length - 1] = list[i];
			}
		}
		return originalList;
	}
	
	@Override
	public void run()
	{
		printLine("Enter number n:");
		int n = in.nextInt();
		printFormatLine("Enter %d numbers", n);
		int[] list = new int[n];
		for (int i = 0; i < list.length; ++ i) {
			list[i] = in.nextInt();
		}
		int [] originalList =  eliminateDuplicates(list);
		print("The distinct numbers are:");
		for (int i = 0; i < originalList.length; ++ i) {
			printFormat("%d ", originalList[i]);
		}
		printLine("");
	}
}
