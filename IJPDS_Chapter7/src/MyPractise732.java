import java.lang.IllegalArgumentException;

/**
 * 练习 7.32: 列表分区
 */
public class MyPractise732 extends AbstractPratiseImpl {

	/**
	 * 测试数据
	 * size: 8
	 * list: 10 1 5 16 61 9 11 1
	 * 
	 * 
	 */
	
	/**
	 * 分区函数
	 * @param list
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static int[] partition(int[] list) throws IllegalArgumentException
	{
		if (list.length == 0) {
			throw new IllegalArgumentException("Empty list");
		} else if (list.length == 1) {
			return list;
		}

	    int pivot = list[0];
	    int low = 1, high = list.length - 1;
        while (low <= high) {
        	if (list[low] > list[high]) {
	        	int temp = list[high];
	        	list[high] = list[low];
	        	list[low] = temp;
        	}
        	while (pivot > list[low]) {
        		low ++;
        	}
        	while (pivot < list[high]) {
        		high --;
        	}
        }
        
        int temp = list[high];
        list[high] = list[0];
        list[0] = temp;
        
        return list;
	}
	
	@Override
	public void run()
	{
		printLine("Enter list size");
		int size = in.nextInt();
		int[] list = new int[size];
		printLine("Enter list content:");
		for (int i = 0; i < list.length; ++ i) {
			list[i] = in.nextInt();
		}
		partition(list);
		print("After the partiton, the list is ");
		for (int i = 0; i < list.length; ++ i) {
			printFormat("%d ", list[i]);
		}
		printLine("");
	}
}
