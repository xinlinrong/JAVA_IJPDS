/**
 * 练习 7.23: 游戏: 储物柜难题
 */
public class MyPractise723 extends AbstractPratiseImpl {

	/**
	 * 储物柜难题执行过程
	 */
	public void runBoxesQuestion()
	{
		int maxBox = 100;
		boolean[] boxes = new boolean[maxBox];
		for(int i = 0; i < boxes.length; ++ i) {
			boxProcess(boxes, i + 1, i);
		}

		print("The open box number is:");
	    for (int i = 0; i < boxes.length; ++ i) {
	    	if (boxes[i]) {
	    		printFormat("%d ", i + 1);
	    	}
	    }
	    printLine("");
	}
	
	/**
	 * 单个执行过程
	 * @param boxes 储物柜数组
	 * @param int studentNumber 学生人数
	 * @param int 开始操作的位移
	 */
	protected void boxProcess(boolean[] boxes, int studentNumber, int startBoxNumber)
	{
		for(int i = startBoxNumber; i < boxes.length; i += studentNumber) {
			boxes[i] = (boxes[i]) ? false : true;
		}
	}
	
	@Override
	public void run()
	{
		runBoxesQuestion();
	}
}
