/**
 * 练习 5.5: 千克与磅之间的互换
 * @author integrate
 */
public class MyPratise55 extends AbstractPratiseImpl {
    public final double KILOGRAM_PER_POUNDS = 2.2;
	@Override
    public void run()
    {
		double kilogram = 0.0, pounds = 15.0;
		double k2p = 0.0, p2k = 0.0;
		this.print("%-10s%45s%45s%45s", "英克", "磅", "磅", "千克");
		for (int i = 1, j = 1; i < 200; i+=2, j++) {
			kilogram = i;
			pounds = 15 + 5 * j;
			k2p = kilogram * KILOGRAM_PER_POUNDS;
			p2k = pounds / KILOGRAM_PER_POUNDS;
			this.print("%-10.0f%10.1f%10.0f%10.2f", kilogram, k2p, pounds, p2k);
		}
    }
}
