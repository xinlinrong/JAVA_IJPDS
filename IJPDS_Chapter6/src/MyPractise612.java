/**
 * Á·Ï°6.12 ÏÔÊ¾×Ö·û
 * @author integrate
 */
public class MyPractise612 extends AbstractPratiseImpl {
	
	public static final int NUMBER_PER_LINES = 10; 
	
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		if (ch1 > ch2) {
			System.out.printf("Parameter value ch1(%c) can not be greater than ch2(%c)\n", ch1, ch2);
			return;
		}

		int lineCounter = 0;
		char currentChar = ch1;
		currentChar += 1;
		do {
	    	if (lineCounter == numberPerLine) {
	    		lineCounter = 0;
	    		System.out.printf("%-2c\n", currentChar);
	    	} else {
	    		lineCounter++;
	    		System.out.printf("%-2c", currentChar);
	    	}
	    	currentChar += 1;
	    } while (currentChar <= ch2 - 1);
	}
	
	@Override
	public void run()
	{
		printChars('1', 'Z', NUMBER_PER_LINES);
	}
}
