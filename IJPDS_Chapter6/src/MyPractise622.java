/**
 * ��ϰ6.22: ��ѧ ƽ�����Ľ�����
 * @author integrate
 */
public class MyPractise622 extends AbstractPratiseImpl {

	public final static double delta = 1e-6;
	
	/**
	 * ���� n �Ŀ�ƽ����
	 * @param n
	 * @return
	 */
	public static double sqrt(long n)
	{
		double nextGuess = 1.0, lastGuess = 1.0;
        do {
        	lastGuess = nextGuess;
        	nextGuess = (lastGuess + n / lastGuess) / 2.0;
        } while (Math.abs(nextGuess - lastGuess) > delta);

        return nextGuess;
	}

    @Override
    public void run() 
    {
    	print("Enter number n:");
    	long number = in.nextLong();
        print("sqrt(%d) is %f", number, sqrt(number));
    }
}
