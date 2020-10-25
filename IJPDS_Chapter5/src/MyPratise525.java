/**
 * 练习 5.25: 计算 PI
 * @author integrate
 */
public class MyPratise525 extends AbstractPratiseImpl {

	/**
	 * 计算 PI 的值
	 * @param number
	 * @return
	 */
	double calcPiValue(int number)
	{
		double piValue = 0.0;
		for (int i = number; i >= 1; -- i) {
			piValue += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		return 4.0 * piValue;
	}
	
	@Override
    public void run()
    {
		double piValue = 0.0;
        int number = 10000, delta = 10000;
        while (number <= 100000) {
            print("While number is %d, pi value is %.20f", number, calcPiValue(number));
        	number += delta;
        }
    }
}
