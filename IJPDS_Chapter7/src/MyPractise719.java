/**
 * 练习 7.19: 是否排序好了
 */
public class MyPractise719 extends AbstractPratiseImpl {

	/**
	 * 判断数组是否排序好了
	 * @param list
	 * @return
	 */
	public static boolean isSorted(int[] list)
	{
		boolean sorted = true;
        for (int i = 0; i < list.length; ++ i) {
        	for (int j = i + 1; j < list.length; ++ j) {
        		if (list[i] > list[j]) {
        			sorted = false;
        			break;
        		}
        	}
            if (!sorted) {
            	break;
            }
        }
        return sorted;
	}
	
	@Override
	public void run()
	{
		printLine("Enter the size of the list:");
		int size = in.nextInt();
		int[] numbers = new int[size];

		printLine("Enter the content of the list:");
        for (int i = 0; i < size; ++ i) {
        	numbers[i] = in.nextInt();
        }
        
        printFormat("The list has %d integers ", size);
        for (int i = 0; i < size; ++ i) {
        	printFormat("%d ", numbers[i]);
        }
    	printLine("");
        
        if (isSorted(numbers)) {
        	printLine("The list is already sorted");
        } else {
        	printLine("The list is not sorted");
        }
	}
}
