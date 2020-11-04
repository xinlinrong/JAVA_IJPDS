
public class MyPratise61 extends AbstractPratiseImpl {

	public final int COLUMN_PER_ROWS = 10;
	
	/**
	 * Á·Ï°: Îå½ÇÊý
	 * @param n
	 * @return
	 */
	public static int getPentagonalNumber(int n)
	{
		return (n * (3 * n - 1) )/ 2;
	}
	
	@Override
    public void run()
    {
		int calcNumber = 0;
		for (int i = 1; i <= 100; ++ i) {
			calcNumber = getPentagonalNumber(i);
			if (i % 10 == 0) {
				System.out.printf("%7d\n", calcNumber);
			} else {
				System.out.printf("%7d", calcNumber);
			}
		}
    }
}
