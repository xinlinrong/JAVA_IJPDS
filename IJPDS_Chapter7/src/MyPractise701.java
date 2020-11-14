/**
 * 练习7.1: 指定等级
 * @author integrate
 */
public class MyPractise701 extends AbstractPratiseImpl {
	
	/**
	 * 根据分数获取对应的等级字符
	 * @param best
	 * @param score
	 * @return
	 */
	private char getGrade(int best, int score)
	{
		char grade = 'A';
    	if (score >= best - 10) {
    		grade = 'A';
    	} else if (score >= best - 20) {
    		grade = 'B';
    	} else if (score >= best - 30) {
    		grade = 'C';
    	} else if (score >= best - 40) {
    		grade = 'D';
    	} else {
    		grade = 'F';
    	}
    	return grade;
	}
	
	@Override
    public void run()
    {
    	printLine("Enter the number of students:");
    	int n = in.nextInt();

    	// 读取每个学生的分数并且获取最高分数
        printFormatLine("Enter %d scores:", n);
    	int best = -1;
    	int[] studentScores = new int[n];
        for (int i = 0; i < studentScores.length; ++ i) {
        	studentScores[i] = in.nextInt();
        	if (studentScores[i] > best) {
        		best = studentScores[i];
        	}
        }

        for (int i = 0; i < studentScores.length; ++ i) {
            printFormatLine("Student %d score is %d and grade is %c", 
            		i + 1, studentScores[i], getGrade(best, studentScores[i]));
        }
    }
}
