/**
 * ��ϰ 5.14: ��ʾ ASCII ����ĸ��
 * @author integrate
 */
public class MyPratise515 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	int colCounter = 0;
    	for (char minCode = '!'; minCode <= '~'; minCode ++) {
			++ colCounter;
    		if (colCounter != 10) {
    			System.out.printf("%-2c", minCode);
    		} else {
    			colCounter = 0;
    			System.out.printf("%c\n", minCode);
    		}
    	}
    }
}
