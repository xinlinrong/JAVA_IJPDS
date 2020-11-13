/**
 * Á·Ï°6.29: Ë«ËØÊı
 * @author integrate
 */
public class MyPractise629 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		int start = 2;
		for (start = 2; start < 1000; ++start) {
			if (MathUtils.isPrime(start) && MathUtils.isPrime(start + 2)) {
				print("(%d, %d)", start, start + 2);
			}
		}
    }
}
