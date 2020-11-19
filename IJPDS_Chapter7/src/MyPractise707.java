/**
 * 练习 7.7: 统计个位数的数目
 */
public class MyPractise707 extends AbstractPratiseImpl {

	/**
	 * 生成 0 - 9 的随机数
	 * @return
	 */
	private int genIntege()
	{
		return (int) (Math.random() * 10);
	}
	
	@Override
	public void run()
	{
        // 初始化 random_counts, 生成数字
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
