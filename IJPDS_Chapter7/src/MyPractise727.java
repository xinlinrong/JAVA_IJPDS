import java.util.Arrays;

/**
 * 练习 7.27: (内容)相同的数组
 */
public class MyPractise727 extends AbstractPratiseImpl {
	/**
	 * 判断两个数组是否相等
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static boolean equals(int[] list1, int[] list2)
	{
		if (list1.length != list2.length) {
			return false;
		}

        if (Arrays.equals(list1, list2)) {
        	return true;
        }

		int equalCount1 = 0;
        for (int i = 0; i < list1.length; ++ i) {
			for (int j = 0; j < list2.length; ++ j) {
				if (list1[i] == list2[j]) {
					++ equalCount1;
					break;
				}
			}
		}

		int equalCount2 = 0;
        for (int i = 0; i < list2.length; ++ i) {
			for (int j = 0; j < list1.length; ++ j) {
				if (list2[i] == list1[j]) {
					++ equalCount2;
					break;
				}
			}
		}

        return (equalCount1 == equalCount2);
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
	    	printLine("Two list are identical");
	    } else {
	    	printLine("Two list are not identical");
	    }
	}
}
