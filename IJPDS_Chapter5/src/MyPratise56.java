/**
 * 练习 5.5: 千克与磅之间的互换
 * @author integrate
 */
public class MyPratise56 extends AbstractPratiseImpl {
    public final double MILES_PER_KILOMETER = 1.609;
    @Override
    public void run()
    {
		double kilometer = 15.0, miles = 0.0;
		double k2m = 0.0, m2k = 0.0;
		this.print("%-10s%45s%45s%45s", "英克", "磅", "磅", "千克");
		for (int i = 1, j = 1; i < 10; i++, j++) {
			miles = i;
			kilometer = 15.0 + 5 * j;
			k2m = kilometer / MILES_PER_KILOMETER;
			m2k = miles * MILES_PER_KILOMETER;
			this.print("%-10.0f%10.3f%10.0f%10.3f", miles, m2k, kilometer, k2m);
		}
    }
}
