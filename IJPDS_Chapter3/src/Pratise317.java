public class Pratise317 extends AbstractPratiseImpl {
 
	private final int SCISSOR = 0;
	private final int ROCK = 1;
	private final int PAPER = 2;

	/**
	 * 验证输出是否满足
	 * @param int input
	 * @return boolean
	 */
	private boolean checkInput(int input)
	{
		return (input == SCISSOR || input == ROCK || input == PAPER);
	}
	
	/**
	 * 电脑生成随即的操作
	 * @return integer
	 */
	private int generateComputerRandomNumber()
	{
		double randomNum = Math.random() * 1000;
		return ((int) (randomNum % 3));
	}

	/**
	 * 根据操作获取对应的名称
	 * @param int actionNumber
	 * @return String
	 */
	private String getActionName(int actionNumber)
	{
		String actionName = "";
		switch (actionNumber) {
		    case SCISSOR: actionName = "scissor"; break;
		    case ROCK: actionName = "rock"; break;
		    default: actionName = "paper"; break;
		}
		return actionName;
	}
	
	/**
	 * 判断玩家的最终结果
	 * @param computerAction
	 * @param playerAction
	 * @return
	 */
	private int judgeResult(int computerAction, int playerAction)
	{
		int result = 0;
		if (playerAction > computerAction) {
			// 当玩家为布而电脑为剪刀时, 玩家输掉游戏
			result = (playerAction == PAPER && computerAction == SCISSOR) ? -1 : 1;
		} else if (playerAction < computerAction) {
			// 当电脑为布而玩家为剪刀时, 玩家赢了游戏
			result = (computerAction == PAPER && playerAction == SCISSOR) ? 1 : -1;
		}
		return result;
	}
	
	@Override
    public void run()
    {
    	print("scissor (0), rock (1), paper (2) :");
    	int playerInput = in.nextInt();
        if (!checkInput(playerInput)) {
        	print("Your input in invalid.");
        	System.exit(-1);
        }

        String playerActionName = "";
        String computerActionName = "";
        int computerRandomNum = generateComputerRandomNumber();
        playerActionName = getActionName(playerInput);
        computerActionName = getActionName(computerRandomNum);
        int result = judgeResult(computerRandomNum, playerInput);
        if (result == 0) {
        	print("The computer is %s. You are %s too. It is a draw", computerActionName, playerActionName);
        } else if (result == -1) {
        	print("The computer is %s. You are %s. You lose", computerActionName, playerActionName);
        } else if (result == 1) {
        	print("The computer is %s. You are %s. You won", computerActionName, playerActionName);
        }
    }
}
