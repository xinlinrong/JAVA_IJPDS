/**
 * ��ϰ 7.28: ��Ϸ: ���
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

	    // ����㷨 (δ�������ظ����ֵ��淨)
        printLine("The combination is:");
        for (int i = 0; i < list.length; ++ i) {
        	for (int j = i + 1; j < list.length; ++ j) {
        		printFormatLine("(%d, %d)", list[i], list[j]);
        	}
        }
	}
}