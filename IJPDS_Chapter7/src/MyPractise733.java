import java.lang.IllegalArgumentException;

/**
 * ��ϰ 7.33: �Ļ�: �й���Ф
 */
public class MyPractise733 extends AbstractPratiseImpl {

	public static String[] zodiac = {
		"monkey", "rooster", "dog", "pig", "rat", "ox",
		"tiger", "rabbit", "dragon", "snake", "horse", "sheep"
	};
	
	@Override
	public void run()
	{
		print("Enter a year");
		int year = in.nextInt();
		printFormatLine("%s", zodiac[year % 12]);
	}
}
