/**
 * 练习 5.10: 找出能同时被5和6整除的数
 * @author integrate
 */
public class MyPratise510 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		int  count = 0;
        for (int i = 100; i < 1000; ++i) {
        	if ((i % 5 == 0 && i % 6 ==0)) {
        		count ++;
        		this.print("%d", i);
                if (count % 10 == 0) {
                	count = 0;
            		this.print("\n");
                }
        	}
        }
    }
}
