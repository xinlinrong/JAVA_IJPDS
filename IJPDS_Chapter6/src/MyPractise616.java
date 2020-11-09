/**
 * 练习6.16: 一年的天数
 * @author integrate
 *
 */
public class MyPractise616 extends AbstractPratiseImpl {

	public int numberOfDaysInYear(int year)
	{
		boolean isLoopYear = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		return (isLoopYear) ? 366 : 365;
	}
	
	@Override
	public void run()
	{
		print("%-15s%-15s", "year", "days");
		print("___________________________");
		for (int i = 2000; i <= 2020; ++ i) {
			print("%-15d%-15d", i, numberOfDaysInYear(i));
		}
	}
}
