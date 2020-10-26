/**
 * 练习 5.39: 模拟, 正面或反面
 * @author integrate
 */
public class MyPratise540 extends AbstractPratiseImpl {

	final public int TRY_TIMES = 1000000;
	
	@Override
	public void run()
	{
		int randomVal = 0;
		int nagativeTimes = 0, positiveTimes = 0;
		for (int i = 0; i < TRY_TIMES; ++ i) {
			randomVal = (int) (Math.random() * 10);
            if (randomVal >= 5) {
            	++positiveTimes;
            } else {
            	++nagativeTimes;
            }
		}

	    print("Throw coin in %d times, positive times was %d, nagative times was %d", 
	    		TRY_TIMES, positiveTimes, nagativeTimes);
	}
}
