/**
 * ��ϰ 7.22: ����һ���ַ����д�д��ĸ����Ŀ
 */
public class MyPractise722 extends AbstractPratiseImpl {

	public static int countUpperCase(String s)
	{
		int $uppercaseCount = 0;
		for (int i = 0; i < s.length(); ++ i) {
			if (Character.isUpperCase(s.charAt(i))) {
				++$uppercaseCount;
			}
		}
		return $uppercaseCount;
	}
	
	@Override
	public void run()
	{
		printLine("Please input a string");
		String s = in.next();
		printFormat("There are %d upper case letter in string %s", countUpperCase(s), s);
	}
}
