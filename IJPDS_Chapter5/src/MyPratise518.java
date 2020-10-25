/**
 * 练习 5.18: 使用循环语句打印4个图案
 * @author integrate
 */
public class MyPratise518 extends AbstractPratiseImpl {

	/**
	 * 打印图1
	 */
	private void printArray1(int rows)
    {
    	for (int i = 0; i < rows; ++ i) {
    		for (int j = 0; j <= i; ++j ) {
    			System.out.printf("%-2d", j + 1);
    		}
			System.out.println("");
    	}
    }
	
	/**
	 * 打印图2
	 */
	private void printArray2(int rows)
	{
    	for (int i = rows; i > 0; -- i) {
    		for (int j = i; j > 0; -- j ) {
    			System.out.printf("%-2d", j);
    		}
			System.out.println("");
    	}
	}
	
	/**
	 * 打印图 3
	 * @param rows
	 */
	private void printArray3(int rows)
	{
    	for (int i = 0; i < rows; ++ i) {
    		for (int j = 0; j < rows; ++ j ) {
    			if (rows - (i + j) - 1> 0) {
        			System.out.printf("%2s", "");		
    			} else {
        			System.out.printf("%-2d", rows - j);
    			}
    		}
			System.out.println("");
    	}
	}

	/**
	 * 打印图 4
	 * @param rows
	 */
	private void printArray4(int rows)
	{
    	for (int i = 0; i < rows; ++ i) {
    		for (int j = 0; j < rows; ++ j ) {
    			if (j < i) {
        			System.out.printf("%2s", "");		
    			} else {
        			System.out.printf("%-2d", j - i + 1);
    			}
    		}
			System.out.println("");
    	}
	}
	
	@Override
    public void run()
    {
		//printArray1(6);
		
		//printArray2(6);
		
		//printArray3(6);

		printArray4(6);
    }
}
