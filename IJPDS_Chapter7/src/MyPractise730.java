import java.lang.IllegalArgumentException;

/**
 * 练习 7.30: 模式识别: 四个连续相等的数
 */
public class MyPractise730 extends AbstractPratiseImpl {

	/**
	 * 判断是否有四个连续的值相等
	 * @param values
	 * @return
	 */
	public static boolean isConsecutiveFour(int[] values) throws IllegalArgumentException
	{
		if (values.length < 4) {
			throw new IllegalArgumentException("list length must greater than 4");
		}
		
		boolean isConFour = false;
		int trackVal = values[0];
		int equalTimes = 0;

		for (int i = 0; i < values.length; ++ i) {
			if (trackVal == values[i] && i != 0) {
				if ((++equalTimes) == 3) {
					isConFour = true;
					break;
				}
			} else {
				trackVal = values[i];
				equalTimes = 0;
			}
		}
	    return isConFour;
	}
	
	@Override
	public void run()
	{
		printLine("Enter the numbe of values:");
		int size = in.nextInt();
		int[] values = new int[size]; 
        printLine("Enter the values:");
        for (int i = 0; i < values.length; ++ i) {
        	values[i] = in.nextInt();
        }
        if (isConsecutiveFour(values)) {
        	printLine("The list has consecutive fours");
        } else {
        	printLine("The list has no consecutive fours");
        }
	}
}
