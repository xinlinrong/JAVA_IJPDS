/**
 * Á·Ï°6.28: Ã·É­ËØÊý
 * @author integrate
 */
public class MyPractise628 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		long p = 2;
		print("%-43s%-43s", "p", "2^p-1");
        for (p = 2; p <= 31; ++p) {
        	long number = (long) Math.pow(2, p) - 1;
        	if (MathUtils.isPrime(number)) {
        		print("%-15d%-15d", p, number);
        	}
        }
    }
}
