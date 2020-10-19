/**
 * 练习 5.4: 将英里转成千米
 * @author integrate
 */
public class MyPratise54 extends AbstractPratiseImpl {
    public final double MILES_PER_KILOMETER = 1.609;
	@Override
    public void run()
    {
		double miles = 0.0;
		double kilometers = 0.0;
		this.print("%-10s%45s", "英里", "千米");
		for (int i = 1; i <= 10; ++i) {
			miles = i;
			kilometers = i * MILES_PER_KILOMETER;
			this.print("%-10.0f%10.3f", miles, kilometers);
		}
    }
}
