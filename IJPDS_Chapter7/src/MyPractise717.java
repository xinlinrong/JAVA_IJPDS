import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * 练习 7.17: 对学生排序
 */
public class MyPractise717 extends AbstractPratiseImpl {
	/* 测试数据
	Jim 76
	Tom 78
	Lucy 82
	Jerry 75
	Scott 87
	*/

	/**
	 * 对学生的名字进行排序
	 * @param studentNames
	 * @param studentScores
	 */
	public void sortScore(String[] studentNames, int[] studentScores)
	{
		// 列出排序的顺序, 通过筛选最大值获取索引
        for (int i = 0; i < studentScores.length; ++ i) {
        	int currentIndex = i;
        	int currentScore = studentScores[i];
        	String currentName = studentNames[i];
        	for (int j = i + 1; j < studentScores.length; ++ j) {
        		if (currentScore < studentScores[j]) {
        			currentScore = studentScores[j];
        			currentName = studentNames[j];
        			currentIndex = j;
        		}
        	}
        	if (i != currentIndex) {
        		studentScores[currentIndex] = studentScores[i];
        		studentNames[currentIndex] = studentNames[i];
        		studentScores[i] = currentScore;
        		studentNames[i] = currentName;
        	}
        }
        
        for (int i = 0; i < studentScores.length; ++ i) {
        	printFormatLine("name: %s, score: %d", studentNames[i], studentScores[i]);
        }
	}
	
	@Override
	public void run()
	{
		printLine("Enter number n:");
		int n = in.nextInt();
		int[] studentScores = new int[n];
		String[] studentNames = new String[n];
		printFormatLine("Enter students name and score:");
		for (int i = 0; i < n; ++i) {
			studentNames[i] = in.next();
			studentScores[i] = in.nextInt();
		}
		sortScore(studentNames, studentScores);
	}
}
