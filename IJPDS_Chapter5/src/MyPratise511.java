/**
 * ��ϰ 5.11: �ҳ��ܱ�5��6��������, ������ͬʱ��������������
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
