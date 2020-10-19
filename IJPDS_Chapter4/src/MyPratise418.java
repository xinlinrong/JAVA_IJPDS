/**
 * 练习 4.18 学生的专业与年级
 * @author integrate
 */
public class MyPratise418 extends AbstractPratiseImpl {

	public final String COURSE = "MIC";
	public final String GRADE = "1234";

	/**
	 * 根据缩写返回课程英文名
	 * @param tag
	 * @return
	 */
	private String findCourseByShortTag(char tag)
	{
		String courseName = "";
		switch (tag) {
		case 'M':
			courseName = "Mathematics";
			break;
		case 'C':
			courseName = "Computer Science";
			break;
		case 'I':
			courseName ="Information Technology";
			break;
		}
		return courseName;
	}

	/**
	 * 根据缩写返回年级英文名
	 * @param tag
	 * @return
	 */
	private String findGradeByShortTag(char tag)
	{
		String gradeName = "";
		switch(tag) {
		case '1':
			gradeName = "Freshman";
			break;
		case '2':
			gradeName = "Sophomore";
			break;
		case '3':
			gradeName = "Junior";
			break;
		case '4':
			gradeName = "Senior";
			break;
		}
		return gradeName;
	}
	
	@Override
    public void run()
    {
		this.print("Enter two characters:");
		String courseGrade = in.next();
		if (courseGrade.length() !=2) {
			this.print("Invalid input");
			System.exit(-1);
		}

        if (COURSE.indexOf(courseGrade.charAt(0)) == -1
        || GRADE.indexOf(courseGrade.charAt(1)) == -1)
        {
			this.print("Invalid input");
			System.exit(-1);
        }
        
        String courseName = findCourseByShortTag(courseGrade.charAt(0));
        String gradeName = findGradeByShortTag(courseGrade.charAt(1));
        this.print("%s %s", courseName, gradeName);
    }
}
