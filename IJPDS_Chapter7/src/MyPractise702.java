/**
 * 练习7.1: 倒置输入的数
 * @author integrate
 */
public class MyPractise702 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	// 确定数据的个数
    	printLine("Enter the number of integer list:");
    	int nCount = in.nextInt();
    	int[] list = new int[nCount]; 

        // 将数据输入到数组
    	printFormatLine("Enter %d number:", nCount);
        for (int i = 0; i < list.length; ++ i) {
        	list[i] = in.nextInt();
        }

        for (int j = list.length - 1; j >= 0; --j) {
            if (j > 0) {
        	    printFormat("%d ", list[j]);
            } else {
        	    printFormatLine("%d", list[j]);
            }
        }
    }
}
