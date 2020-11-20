import java.util.Arrays;
import java.lang.IllegalArgumentException;

/**
 * ��ϰ 7.17: ��ѧ������
 */
public class MyPractise717 extends AbstractPratiseImpl {
	/* ��������
	Jim 76
	Tom 78
	Lucy 82
	Jerry 75
	Scott 87
	*/

	/**
	 * ��ѧ�������ֽ�������
	 * @param studentNames
	 * @param studentScores
	 */
	public void sortScore(String[] studentNames, int[] studentScores)
	{
		// �г������˳��, ͨ��ɸѡ���ֵ��ȡ����
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
