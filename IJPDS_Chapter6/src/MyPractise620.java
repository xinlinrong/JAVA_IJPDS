/**
 * ����һ���ַ������ַ��ĸ���
 * @author integrate
 */
public class MyPractise620 extends AbstractPratiseImpl {

	/**
	 * �����ַ�������ĸ�ĸ���
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
