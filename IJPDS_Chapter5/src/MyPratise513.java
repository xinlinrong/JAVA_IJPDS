/**
 * ��ϰ 5.13: �ҳ�nƽ�� > 12000 �� n ����Сֵ
 * @author integrate
 */
public class MyPratise513 extends AbstractPratiseImpl {

	private final int MAX_INTEGER = 12000;
	
	/**
	 * ���� n ������
	 * @param n
	 * @return integer
	 */
	private int calcPow3(int n)
	{
		return (n * n * n);
	}
	
	@Override
    public void run()
    {
		int n = 1;
        while (calcPow3(n) < MAX_INTEGER) {
        	++ n;
        }
        print("Min n is %d", n - 1);
    }
}
