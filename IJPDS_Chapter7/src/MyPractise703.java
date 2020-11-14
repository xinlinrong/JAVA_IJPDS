import java.lang.IllegalArgumentException;

/**
 * 练习7.3: 计算数字的出现次数
 * @author integrate
 */
public class MyPractise703 extends AbstractPratiseImpl {

	/**
	 * 创建数组空间
	 * @param size
	 * @param copyNumList
	 * @return int[]
	 * @throws IllegalArgumentException
	 */
	public int[] createNumList(int size, int[] copyNumList) throws IllegalArgumentException
	{
		if (size < 0) {
			throw new IllegalArgumentException("Params size must be greate than 0");
		}		
		if (copyNumList != null && size < copyNumList.length) {
			throw new IllegalArgumentException("Params size must be greate than array copyNumList size");
		}
	    int[] numList = new int[size];
	    if (copyNumList != null && copyNumList.length>0) {
	    	System.arraycopy(copyNumList, 0, numList, 0, copyNumList.length);
	    }
	    return numList;
	}
	
	/**
	 * 排除数组中的重复数字, 输出具有唯一数字的数组
	 * @param numList
	 * @return int []
	 * @throws IllegalArgumentException
	 */
	public int[] getUniqueNumList(int[] numList)
	{
		if (numList == null || numList.length == 0) throw new IllegalArgumentException("Parameter numList invalid");
		int[] uniqueNumList = new int[0];
		uniqueNumList = createNumList(1, new int[] {numList[0]});

		for (int i = 0; i < numList.length; ++ i) {
			boolean hasFind = false;
			for (int j = 0; j < uniqueNumList.length; ++ j) {
        		if (numList[i] == uniqueNumList[j]) {
        			hasFind = true;
        			break;
        		}
        	}
        	// 末尾追加
        	if (hasFind == false) {
        		uniqueNumList = createNumList(uniqueNumList.length + 1, uniqueNumList);
        		uniqueNumList[uniqueNumList.length - 1] = numList[i];
        	}
        }
		return uniqueNumList;
	}
	
	@Override
    public void run() throws IllegalArgumentException
    {
        // 获取输入的数字
    	int index = 0, number = -1;
        int[] numList = createNumList(1, null);
    	printLine("Enter the integer between 1 and 100:");
    	while ((number = in.nextInt()) != 0) {
            if (number == 0) {
            	break;
            } else if (number > 100 || number < 1) {
    			throw new IllegalArgumentException("Number must between 1 and 100");
    		} else {
    			if (index == numList.length) {
    				numList = createNumList(numList.length + 1, numList);
    			}
    			numList[index] = number;
    			++index;
    		}
    	}

        // 对数字进行排序
    	for (int i = 0; i < numList.length; ++ i) {
    		for (int j = i; j < numList.length; ++ j ) {
    			if (numList[i] > numList[j]) {
    				int temp = numList[i];
    				numList[i] = numList[j];
    				numList[j] = temp;
    			}
    		}
    	}

        int[] uniqueNumList = getUniqueNumList(numList);
        for (int i = 0; i < uniqueNumList.length; ++ i) {
        	int numCount = 0;
        	for (int j = 0; j < numList.length; ++ j) {
        		if (uniqueNumList[i] == numList[j]) {
        			++ numCount;
        		}
        	}
        	if (numCount > 1) {
        		printFormatLine("%d occurs %d times", uniqueNumList[i], numCount);
        	} else if (numCount == 1) {
        		printFormatLine("%d occurs %d time", uniqueNumList[i], numCount);
        	}
        }
    }
}
