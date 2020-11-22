/**
 * 练习 7.28: 游戏: 组合
 */
public class MyPractise728 extends AbstractPratiseImpl {

	@Override
	public void run()
	{
		printLine("Enter size of list:");
		int size = in.nextInt();
        int[] list = new int[size];
        printLine("Enter list:");
        for (int i = 0; i < size; ++ i) {
        	list[i] = in.nextInt();
        }

	    // 组合算法 (未计入有重复数字的玩法)
        printLine("The combination is:");
        for (int i = 0; i < list.length; ++ i) {
        	for (int j = i + 1; j < list.length; ++ j) {
        		printFormatLine("(%d, %d)", list[i], list[j]);
        	}
        }
	}
}