/**
 * 计算一个字符串中字符的个数
 * @author integrate
 */
public class MyPractise620 extends AbstractPratiseImpl {

	/**
	 * 计算字符串中字母的个数
	 * @param s
	 * @return
	 */
	public static int countLetters(String s)
	{
		int countLetters = 0;
        for (int i = 0; i < s.length(); ++ i) {
        	if (Character.isLetter(s.charAt(i))) {
        		++countLetters;
        	}
        }
        return countLetters;
	}

    @Override
    public void run()
    {
    	print("Enter String s:");
    	String s = in.nextLine();
        print("String '%s' has %d letters", s, countLetters(s));
    }
}
