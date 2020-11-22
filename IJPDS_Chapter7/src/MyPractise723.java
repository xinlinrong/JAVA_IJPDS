/**
 * ��ϰ 7.23: ��Ϸ: ���������
 */
public class MyPractise723 extends AbstractPratiseImpl {

	/**
	 * ���������ִ�й���
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
	 * ����ִ�й���
	 * @param boxes ���������
	 * @param int studentNumber ѧ������
	 * @param int ��ʼ������λ��
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
