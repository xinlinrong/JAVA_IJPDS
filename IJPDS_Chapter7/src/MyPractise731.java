import java.lang.IllegalArgumentException;

/**
 * ��ϰ 7.31: �ϲ����������б�
 */
public class MyPractise731 extends AbstractPratiseImpl {
	
	/**
	 * ��������
	 * list1: 5 1 5 16 61 111
	 * list2: 5 2 4 5 6 99
	 */
	
	/**
	 * �ϲ����������б�
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static int[] merge(int[] list1, int[] list2) throws IllegalArgumentException
	{
		if (list1.length <= 0 || list2.length <= 0) {
			throw new IllegalArgumentException("list 1 and list2 can not be empty");
		}

		int list1Cur = 0, list2Cur = 0; 
		int[] mergeList = new int[list1.length + list2.length];
		for (int i = 0; i < mergeList.length; ++ i) {
			// ���ϱȽ�ֱ����һ�������ָ�뵽��ͷ
			if (list1Cur < list1.length && list2Cur < list2.length) {
				if (list1[list1Cur] > list2[list2Cur]) {
					mergeList[i] = list2[list2Cur];
				    ++ list2Cur; // ָ�뵽�ﾡͷ
				} else {
					mergeList[i] = list1[list1Cur];
				    ++ list1Cur; // ָ�뵽�ﾡͷ
				}
			} else {
				if (list1.length >= list2.length) {
					mergeList[i] = list1[list1Cur];
					++ list1Cur;
				} else {
					mergeList[i] = list2[list2Cur];
					++ list2Cur;
				}
			}
		}
		return mergeList;
	}
	
	@Override
	public void run()
	{
		printLine("Enter list 1 size and contents");
		int sizeOfList1 = in.nextInt();
		int[] list1 = new int[sizeOfList1];
		for (int i = 0; i < list1.length; ++ i) {
			list1[i] = in.nextInt();
		}

		printLine("Enter list 2 size and contents");
		int sizeOfList2 = in.nextInt();
		int[] list2 = new int[sizeOfList2];
		for (int i = 0; i < list2.length; ++ i) {
			list2[i] = in.nextInt();
		}

	    print("list1 is:");
	    for (int i = 0; i < list1.length; ++ i) {
	    	printFormat("%d ", list1[i]);
	    }
	    printLine("");

	    print("list2 is:");
	    for (int i = 0; i < list2.length; ++ i) {
	    	printFormat("%d ", list2[i]);
	    }
	    printLine("");

	    int[] mergeList = merge(list1, list2);
	    print("The merged list is ");
	    for (int i = 0; i < mergeList.length; ++ i) {
	    	printFormat("%d ", mergeList[i]);
	    }
	    printLine("");
	}
}
