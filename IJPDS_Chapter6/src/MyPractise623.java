/**
 * ��ϰ6.23: ָ���ַ��ĳ��ִ���
 * @author integrate
 */
public class MyPractise623 extends AbstractPratiseImpl {
	/**
	 * �����ַ��ĳ��ִ���
	 * @param s
	 * @param c
	 * @return
	 */
	public static int count(String s, char c)
	{
		int count = 0;
		for (int i = 0; i < s.length(); ++ i) {
			if (s.charAt(i) == c) {
				++count;
			}
		}
		return count;
	}

	@Override
    public void run()
    {
    	print("Enter String s:");
    	String s = in.nextLine();
        print("Enter char c");
        String findChar = in.nextLine();
    	int count = count(s, findChar.charAt(0));
        print("String %s has %d %c", s, count, findChar.charAt(0));
    }
}
