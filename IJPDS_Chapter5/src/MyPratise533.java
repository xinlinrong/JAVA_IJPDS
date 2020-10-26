/**
 * Á·Ï° 5.33: ÍêÈ«Êı
 * @author integrate
 */
public class MyPratise533 extends AbstractPratiseImpl {

	public boolean isCompleteDigit(int number)
	{
		int result = 0;
		for (int i = 1; i <= number / 2; ++ i) {
			if (number % i == 0) {
				result += i;
			}
		}
		return (number == result);
	}
	
	@Override
	public void run()
	{
		for (int i = 1; i <= 10000; ++i) {
			if (isCompleteDigit(i)) {
				System.out.printf("%-5d", i);
			}
		}
		print("");
	}
}
