/**
 * ��ϰ6.17: ��ʾ0��1���ɵľ���
 * @author integrate
 */
public class MyPractise617 extends AbstractPratiseImpl {

	@Override
	public void run()
	{
		print("Enter n:");
		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.printf("%2d", (int)(Math.random() + 0.5));
			}
			System.out.println("");
		}
	}
}
