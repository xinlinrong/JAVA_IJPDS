
public class Pratise319 extends AbstractPratiseImpl {

	/**
	 * 检查任意两边之和大于第三边
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
	 * 计算三角形的周长
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
