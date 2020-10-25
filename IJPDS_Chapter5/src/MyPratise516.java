/**
 * ��ϰ 5.16: �ҳ�һ������������
 * @author integrate
 */
public class MyPratise516 extends AbstractPratiseImpl {
	/**
	 * ��ȡ��С������
	 * @param number
	 * @return
	 */
    private int getMinFactor(int number)
    {
    	int factor = 2;
        while (number % factor != 0) {
        	++factor;
        }
        return factor;
    }

	@Override
    public void run()
    {
    	int minFactor = 1, number = -1;
		this.print("Enter an integer:");
    	number = in.nextInt();

    	while(number != 1) {
    		// ��ȡ��С����
    		minFactor = getMinFactor(number); 
    		number /= minFactor;
    		System.out.printf("%-2d", minFactor);
    	}
		System.out.printf("\n");
    }
}
