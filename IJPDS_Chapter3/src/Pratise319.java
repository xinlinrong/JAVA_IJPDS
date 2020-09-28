
public class Pratise319 extends AbstractPratiseImpl {

	/**
	 * �����������֮�ʹ��ڵ�����
	 * @param lineA
	 * @param lineB
	 * @param lineC
	 * @return boolean
	 */
	private boolean checkAvailable(double lineA, double lineB, double lineC)
	{
		return ((lineA + lineB) > lineC) && ((lineB + lineC) > lineA) && ((lineA + lineC) > lineB);
	}
	
	/**
	 * ���������ε��ܳ�
	 */
    @Override
    public void run()
    {
    	print("Enter three lines of rectangle:");
    	double lineA = in.nextDouble();
    	double lineB = in.nextDouble();
    	double lineC = in.nextDouble();

    	if (!checkAvailable(lineA, lineB, lineC)) {
    		print("Input is invalid");
    		System.exit(-1);
    	}

        print("S = %.2f + %.2f + %.2f = %.2f", lineA, lineB, lineC, (lineA + lineB + lineC));
    }
}
