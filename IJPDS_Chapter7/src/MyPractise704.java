/**
 * Á·Ï° 7.4: ·ÖÎö³É¼¨
 */
public class MyPractise704 extends AbstractPratiseImpl {	
	@Override
	public void run()
	{
        printLine("Enter the numbers:");
        double avgScore = 0.0;
        String numberLine = in.nextLine();
        String numberStrList [] = numberLine.split(" ");
         for (String numberStr : numberStrList) {
        	 double score = Double.parseDouble(numberStr);
        	 if (score > 0) {
        		 avgScore += score;
        	 }
         }
         
         avgScore /= (numberStrList.length - 1);
         int scoreAboveAvg = 0, scoreBelowAvg = 0;
         for (String numberStr : numberStrList) {
        	 double score = Double.parseDouble(numberStr);
        	 if (score >= avgScore) {
        		 ++scoreAboveAvg;
        	 } else {
        		 ++scoreBelowAvg;
        	 }
         }

         printFormatLine("The average score is %.1f", avgScore);
         printFormatLine("The number of score above average score is %d", scoreAboveAvg);
         printFormatLine("The number of score below average score is %d", scoreBelowAvg);
	}
}