/**
 * ��ϰ 5.11: �ҳ�nƽ�� > 12000 �� n ����Сֵ
 * @author integrate
 */
public class MyPratise512 extends AbstractPratiseImpl {

	private final int MAX_INTEGER = 12000;
	
	/**
	 * ���� n ��ƽ��
	 * @param n
	 * @return integer
	 */
	private int calcSqare(int n)
	{
		return (n * n);
	}
	
	@Override
    public void run()
    {
		int n = 1;
        while (calcSqare(n) < MAX_INTEGER) {
        	++ n;
        }
        print("Min n is %d", n);
    }
}
