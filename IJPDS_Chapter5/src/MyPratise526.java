/**
 * ��ϰ 5.26: ���� e
 * @author integrate
 */
public class MyPratise526 extends AbstractPratiseImpl {

	/**
	 * ����׳�
	 * @param number
	 * @return
	 */
	public double calcRecursion(int number)
	{
		double result = 1;
         for (int i = 1; i <= number; ++ i) {
        	 result *= i;
         }
         return result;
	}
	
	/**
	 * ���� PI ��ֵ
	 * @param number
	 * @return
	 */
	double calcEValue(int number)
	{
		double eValue = 1.0;
		for (int i = number; i >= 1; -- i) {
			eValue += 1.0 / calcRecursion(i);
		}
		return eValue;
	}
	
	@Override
    public void run()
    {
		double eValue = 0.0;
        int number = 10000, delta = 10000;
        while (number <= 100000) {
            print("While number is %d, e value is %.20f", number, calcEValue(number));
        	number += delta;
        }
    }
}