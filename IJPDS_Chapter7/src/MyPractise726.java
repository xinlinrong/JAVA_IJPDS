import java.util.Arrays;

/**
 * 练习 7.26: 完全相同的数组
 */
public class MyPractise726 extends AbstractPratiseImpl {

	/**
	 * 判断两个数组是否严格相等
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static boolean equals(int[] list1, int[] list2)
	{
		return Arrays.equals(list1, list2);
	}
	
	@Override
	public void run()
	{
		print("Enter list1 size and contents:");
		int list1Size = in.nextInt();
        int [] list1 = new int[list1Size];
        for (int i = 0; i < list1.length; ++ i) {
        	list1[i] = in.nextInt();
        }

		print("Enter list2 size and contents:");
		int list2Size = in.nextInt();
        int [] list2 = new int[list2Size];
        for (int i = 0; i < list2.length; ++ i) {
        	list2[i] = in.nextInt();
        }

	    if (equals(list1, list2)) {
	    	printLine("Two list are strictly identical");
	    } else {
	    	printLine("Two list are not strictly identical");
	    }
	}
}
