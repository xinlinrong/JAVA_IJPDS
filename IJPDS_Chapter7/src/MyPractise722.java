/**
 * 练习 7.22: 计算一个字符串中大写字母的数目
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
