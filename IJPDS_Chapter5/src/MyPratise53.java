/**
 * 练习 5.3: 将千克转换成榜
 * @author integrate
 */
public class MyPratise53 extends AbstractPratiseImpl {
    public final double KILOGRAM_PER_POUNDS = 2.2;
	@Override
    public void run()
    {
		double kilogram = 0.0;
		double pounds = 0.0;
		this.print("%-10s%45s", "千克", "磅");
		for(int i = 1; i < 200; i+=2) {
			kilogram = i;
			pounds = i *  KILOGRAM_PER_POUNDS;
			this.print("%-10.0f%10.1f", kilogram, pounds);
		}
    }
}
