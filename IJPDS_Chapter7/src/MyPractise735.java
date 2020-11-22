/**
 * Á·Ï° 7.35: ÓÎÏ·: ²Â×Ö´ÊÓÎÏ·
 */
public class MyPractise735 extends AbstractPratiseImpl {

	private static String[] guessWords = {
		"program", "write", "that"
	};
	
	/**
	 * »ñÈ¡Ëæ»ú×Ö·û´®
	 * @return
	 */
	private static String getRandomString()
	{
		int index = (int) (Math.random() * 3);
		return guessWords[index];
	}
	
	private void doGuessGame()
	{
		int mistakeTimes = 0;
		String guessWord = getRandomString();
        String maskWord = "*".repeat(guessWord.length());
        do {
        	printFormatLine("(Guess) Enter a letter in word %s >", maskWord);
            String guessChar = in.next();
            char inputChar = guessChar.charAt(0);
            if (maskWord.indexOf(inputChar) != -1) {
            	printFormatLine("     %c is already in the word", inputChar);
            	continue;
            }

            if (guessWord.indexOf(inputChar) == -1) {
            	++mistakeTimes;
            	printFormatLine("     %c is not in the word", inputChar);
            	continue;
            }

            char[] charArr = maskWord.toCharArray();
            for (int i = 0; i < guessWord.length(); ++ i) {
            	if (guessWord.charAt(i) == inputChar) {
            		charArr[i] = inputChar;
            	}
            }
            maskWord = String.valueOf(charArr);
        } while (maskWord.indexOf('*') != -1);
	    printFormatLine("The word is %s. You missed %d times", guessWord, mistakeTimes);
	}
	
	@Override
	public void run()
	{
		String continues = "y";
		do {
			doGuessGame();
            printLine("Do you want to guess another word? Enter y or n");
            continues = in.next();
		} while (continues.compareToIgnoreCase("y") == 0);
	}
}