/**
 * Á·Ï° 7.34: ¶Ô×Ö·û´®ÖÐµÄ×Ö·ûÅÅÐò
 */
public class MyPractise734 extends AbstractPratiseImpl {

	public static String sort(String s)
	{
		char[] charArr = s.toCharArray();
		for (int i = 0; i < charArr.length; ++ i) {
			for (int j = i + 1; j < charArr.length; ++ j) {
				if (charArr[i] > charArr[j]) {
					char temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}
		return String.valueOf(charArr);
	}
	
	@Override
	public void run()
	{
		printLine("Enter a string");
	    String s = in.next();
		printFormatLine("Final string is: %s", sort(s));
	}
}
