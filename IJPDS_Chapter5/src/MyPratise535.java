/**
 * Á·Ï° 5.35: ¼Ó·¨
 * @author integrate
 */
public class MyPratise535 extends AbstractPratiseImpl {

	@Override
	public void run()
	{
		double result = 0.0;
		double denominator = 0.0;
		for (int i = 1; i < 625; ++ i) {
			denominator = Math.sqrt(i) + Math.sqrt(i + 1);
			result += 1.0 / denominator;
		}

		print("Final result is %.6f", result);
	}
}
