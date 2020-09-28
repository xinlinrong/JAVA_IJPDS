/**
 * 游戏:彩票
 * @author integrate
 *
 */
public class Pratise315 extends AbstractPratiseImpl {

	/**
	 * 检查数字是否在数组中
	 * @param digit
	 * @param digitArray
	 * @return boolean
	 */
	private boolean hasSameDigit(int digit, int randomDigit)
	{
		boolean isIn = false;
		int hundred = randomDigit / 100;
		int decimal = (randomDigit % 100) / 10;
		int one = randomDigit % 10;
	    int randomDigitArr[] = {hundred, decimal, one};

	    for (int i = 0; i < randomDigitArr.length; ++i) {
			if (digit == randomDigitArr[i]) {
				isIn = true;
				break;
			}
		}
		return isIn;
	}
	
	/**
	 * 检查猜中符合的数字数量
	 * @param randomLotteryNumber
	 * @param inputLotteryNumber
	 * @return
	 */
	private int matchCount(int randomLotteryNumber, int inputLotteryNumber)
	{
	    int matchCount = 0;
	    int inputDigit = inputLotteryNumber;

	    while(inputDigit>0) {
		    if (hasSameDigit(inputDigit%10, randomLotteryNumber)) {
		    	matchCount += 1;
		    }
		    inputDigit /= 10;
	    }
	    return matchCount;
	}
	
	/**
	 * 生成彩票数字
	 * @return
	 */
	private int generateLotteryDigit()
    {
		int randomLotteryNumber = 0;
        while (randomLotteryNumber < 100) {
        	randomLotteryNumber = (int) (Math.random() * 1000);
        }
        return randomLotteryNumber;
    }
	
	@Override
    public void run()
    {
    	int randomLotteryNumber = generateLotteryDigit();
        print("Please Enter your lottery number (100-999):");
        int inputLotteryNumber = in.nextInt();
        print("The lottery number is %d", randomLotteryNumber);
        
        if (randomLotteryNumber == inputLotteryNumber) {
        	print("Exact match, you win $10000");
        } else {
        	int matchCount = matchCount(randomLotteryNumber, inputLotteryNumber);
            if (matchCount == 3) {
            	print("Match all digits, you win $3000");
            } else if (matchCount > 0 && matchCount < 3) {
            	print("Match one digits, you win $1000");
            } else {
            	print("Sorry, not match");
            }
        }
    }
}
