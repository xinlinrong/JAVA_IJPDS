/**
 * ��ϰ 5.4: ��Ӣ��ת��ǧ��
 * @author integrate
 */
public class MyPratise54 extends AbstractPratiseImpl {
    public final double MILES_PER_KILOMETER = 1.609;
	@Override
    public void run()
    {
		double miles = 0.0;
		double kilometers = 0.0;
		this.print("%-10s%45s", "Ӣ��", "ǧ��");
		for (int i = 1; i <= 10; ++i) {
			miles = i;
			kilometers = i * MILES_PER_KILOMETER;
			this.print("%-10.0f%10.3f", miles, kilometers);
		}
    }
}
