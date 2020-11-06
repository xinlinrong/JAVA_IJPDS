/**
 * ��ϰ: 6.6 ��ʾͼ��
 * @author integrate
 */
public class MyPractise66 extends AbstractPratiseImpl  {

	public final static int THIS_DIVISOR = 10;
	
	/**
	 * �� digit ��ȡλ��
	 * @param n
	 */
	private static int getDigitBytes(int n)
	{
		int nBytes = 1, remain = n;
		do {
			++nBytes;
			remain = remain/THIS_DIVISOR;
		} while (remain != 0);
		return nBytes;
	}
	
	/**
	 * ��ӡ��
	 * @param n
	 */
	public static void displayPattern(int n)
	{
         for (int i = 0; i < n; ++ i) {
        	 for (int j = 0; j < n; ++ j) {
        		 String format = (j > n - i - 1) ? "%-" + getDigitBytes(n-j) + "d" : "%-" + getDigitBytes(n-j) + "s";
        		 if (j >= n - i - 1) {
        			 System.out.printf(format, n - j);
        			 continue;
        		 } else {
        		     System.out.printf(format, "");
        		 }
        	 }
        	 System.out.println();
         }
	}
	
	@Override
    public void run()
    {
		print("Enter number n:");
		int n = in.nextInt();
		displayPattern(n);
    }
}
