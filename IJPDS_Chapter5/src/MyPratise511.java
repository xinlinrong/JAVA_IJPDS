/**
 * 练习 5.11: 找出能被5和6整除的数, 但不能同时被两者整除的数
 * @author integrate
 */
public class MyPratise511 extends AbstractPratiseImpl {
    public final int MIN = 100;
	public final int MAX = 200;
    public final int LINE = 10;
	
	@Override
    public void run()
    {
		int lineCounter = 0;
    	for (int i = MIN; i < MAX; ++ i) {
    		if ((i % 5 == 0 && i % 6 != 0) || (i % 5 != 0 && i % 6 == 0)) {
				lineCounter ++;
    			if (lineCounter % 10 != 0) {
    				System.out.printf("%d ", i);
    			} else {
    				lineCounter = 0;
    				System.out.printf("%d\n", i);
    			}
    		}
    	}
    }
}
