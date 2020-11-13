/**
 * 练习6.32: 赢取双筛子赌博游戏的机会
 * @author integrate
 */
public class MyPractise632 extends AbstractPratiseImpl {

	private boolean gambleOneTime()
	{
		int number1 = MathUtils.randInt(6);
        int number2 = MathUtils.randInt(6);
        int sum = number1 + number2;

        if (sum == 2 || sum == 3 || sum == 12) {
        	print("You rolled %d + %d = %d", number1, number2, sum);
        	print("You lose");
        	return false;
        } else if (sum == 7 || sum == 11) {
        	print("You rolled %d + %d = %d", number1, number2, sum);
        	print("You win");
        	return true;
        }

        boolean isWin = false;
        int oldSum = sum;
        print("point is %d", oldSum);
	    do {
			number1 = MathUtils.randInt(6);
	        number2 = MathUtils.randInt(6);
	        sum = number1 + number2;
            if (sum == 7) {
            	print("You rolled %d + %d = %d", number1, number2, sum);
            	print("You lose");
            	break;
            } else if (sum == oldSum) {
            	print("You rolled %d + %d = %d", number1, number2, sum);
            	print("You win");
            	isWin = true;
            	break;
            }
	    } while (true);

	    return isWin;
	}
	
	@Override
    public void run()
    {
		int winNums = 0;
		for (int i = 0; i < 10000; ++ i) {
			if (gambleOneTime()) ++ winNums;
		}
		
		print("Final you win %d times", winNums);
    }
}
