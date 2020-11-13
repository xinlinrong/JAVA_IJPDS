/**
 * Á·Ï°6.30: Ë«É¸×Ó¶Ä²©
 * @author integrate
 */
public class MyPractise630 extends AbstractPratiseImpl {

	private void gambleOneTime()
	{
		int number1 = MathUtils.randInt(6);
        int number2 = MathUtils.randInt(6);
        int sum = number1 + number2;

        if (sum == 2 || sum == 3 || sum == 12) {
        	print("You rolled %d + %d = %d", number1, number2, sum);
        	print("You lose");
        	return;
        } else if (sum == 7 || sum == 11) {
        	print("You rolled %d + %d = %d", number1, number2, sum);
        	print("You win");
        	return;
        }

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
            	break;
            }
	    } while (true);
	}
	
	@Override
    public void run()
    {
		gambleOneTime();
    }
}
