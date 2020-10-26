/**
 * ��ϰ 5.34: ��Ϸ, ����ʯͷ��
 * @author integrate
 */
public class MyPratise534 extends AbstractPratiseImpl {
		 
		private final int SCISSOR = 0;
		private final int ROCK = 1;
		private final int PAPER = 2;

		/**
	 * ��֤����Ƿ�����
	 * @param int input
	 * @return boolean
	 */
	private boolean checkInput(int input)
	{
		return (input == SCISSOR || input == ROCK || input == PAPER);
	}
	
	/**
	 * ���������漴�Ĳ���
	 * @return integer
	 */
	private int generateComputerRandomNumber()
	{
		double randomNum = Math.random() * 1000;
		return ((int) (randomNum % 3));
	}

	/**
	 * ���ݲ�����ȡ��Ӧ������
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
	 * �ж���ҵ����ս��
	 * @param computerAction
	 * @param playerAction
	 * @return
	 */
	private int judgeResult(int computerAction, int playerAction)
	{
		int result = 0;
		if (playerAction > computerAction) {
			// �����Ϊ��������Ϊ����ʱ, ��������Ϸ
			result = (playerAction == PAPER && computerAction == SCISSOR) ? -1 : 1;
		} else if (playerAction < computerAction) {
			// ������Ϊ�������Ϊ����ʱ, ���Ӯ����Ϸ
			result = (computerAction == PAPER && playerAction == SCISSOR) ? 1 : -1;
		}
		return result;
	}
	
	@Override
    public void run()
    {
        int winTimes = 0;
        String playerActionName = "";
        String computerActionName = "";
        int computerRandomNum = -1;
        int result = 0;
        
        while (winTimes <= 2) {
    		print("scissor (0), rock (1), paper (2) :");
        	int playerInput = in.nextInt();
            if (!checkInput(playerInput)) {
            	print("Your input in invalid.");
            	continue;
            }
        	computerRandomNum = generateComputerRandomNumber();
	        playerActionName = getActionName(playerInput);
	        computerActionName = getActionName(computerRandomNum);
	        result = judgeResult(computerRandomNum, playerInput);
	        if (result == 0) {
	        	print("The computer is %s. You are %s too. It is a draw", computerActionName, playerActionName);
	        } else if (result == -1) {
	        	print("The computer is %s. You are %s. You lose", computerActionName, playerActionName);
	        } else if (result == 1) {
	        	++ winTimes;
	        	print("The computer is %s. You are %s. You won", computerActionName, playerActionName);
		    }
		 }
        print("Game End......");
    }
}
