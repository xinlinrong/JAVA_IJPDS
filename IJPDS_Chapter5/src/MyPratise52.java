/**
 * 习题 5.2 重复加法
 * @author integrate
 */
public class MyPratise52 extends AbstractPratiseImpl {
    private int correctCount = 0;
    private int errorCount = 0;
    private String questions = "";
	public final int NUMBER_OF_QUESTIONS = 10;
	
	/**
	 * 回答问题
	 * @return
	 */
	public boolean answerQuestion(int maxNum)
	{
		int number1 = (int) (Math.random() * (maxNum + 1));
		int number2 = (int) (Math.random() * (maxNum + 1));
		this.print(
			"What is %d + %d?", number1, number2);
        int answer = in.nextInt();
        if (answer == number1 + number2) {
        	this.correctCount++;
        	this.questions += String.format("%d +%d = %d correct\n", number1, number2, (number1 + number2));
        	this.print("You are corrent!");
        } else {
        	this.errorCount ++;
        	this.questions += String.format("%d +%d = %d wrong\n", number1, number2, (number1 + number2));
        	this.print("Your answer is wrong");
        	this.print("%d + %d should be %d", number1, number2, (number1 + number2));
        }
        return (answer == number1 + number2);
	}
	
	@Override
    public void run()
    {
		long startTime = System.currentTimeMillis();
    	for (int i = 0; i < NUMBER_OF_QUESTIONS; ++ i) {
    		answerQuestion(15);
    	}
    	long endTime = System.currentTimeMillis();
    	this.print("Corrent count is %d", correctCount);
    	this.print("Test time is %d seconds", ((endTime - startTime)/1000));
    	this.print("");
    	this.print("%s", this.questions);

    }
}
