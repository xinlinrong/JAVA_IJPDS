/**
 * ��ϰ 7.7: ͳ�Ƹ�λ������Ŀ
 */
public class MyPractise707 extends AbstractPratiseImpl {

	/**
	 * ���� 0 - 9 �������
	 * @return
	 */
	private int genIntege()
	{
		return (int) (Math.random() * 10);
	}
	
	@Override
	public void run()
	{
        // ��ʼ�� random_counts, ��������
        int[] random_counts = new int[100];
        for (int i = 0; i < random_counts.length; ++ i) {
        	random_counts[i] = genIntege();
        }

	    int[] counts = new int[10];
        for (int i = 0; i < counts.length; ++ i) {
        	for (int j = 0; j < random_counts.length; ++ j) {
        		if (random_counts[j] == i) {
        			counts[i] ++;
        		}
        	}
        }
        
        for (int i = 0; i < counts.length; ++ i) {
        	printFormatLine("Number %d has count %d", i, counts[i]);
        }
	}
}
