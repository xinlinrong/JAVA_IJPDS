/**
 * ��ϰ 7.20: ����, ��һԪ���η���ʽ
 */
public class MyPractise725 extends AbstractPratiseImpl {
	/**
	 * ����ʽ��ķ���
	 * @param eqn ϵ��
	 * @param roots ��
	 * @return ���ĸ���
	 */
    public static int solveQuadratic(double[] eqn, double[] roots)
    {
    	int rootCount = 0;
    	double delta = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
        if (delta < 0) {
        	return 0;
        } else if (delta == 0) {
        	rootCount = 1;
        	roots[0] = -1 * eqn[1] / (2 * eqn[0]);
        	roots[1] = roots[0];
        } else if (delta > 0) {
        	rootCount = 2;
        	roots[0] = (-1 * eqn[1] + (Math.sqrt(delta)))/ (2 * eqn[0]);
        	roots[1] = (-1 * eqn[1] - (Math.sqrt(delta)))/ (2 * eqn[0]);
        }
    	return rootCount;
    }

	@Override
	public void run()
	{
		double[] eqn = new double[3];
		double[] roots = new double[2];
		printLine("Enter a, b, c:");
		for (int i = 0; i < eqn.length; ++ i) {
			eqn[i] = in.nextDouble();
		}
        int rootCount = solveQuadratic(eqn, roots);
        if (rootCount == 1) {
        	printFormatLine("The equation has one root %f", roots[0]);
        } else if (rootCount == 2) {
        	printFormatLine("The equation has two root %f and %f", roots[0], roots[1]);
        } else {
        	printLine("The equation has no reals root");
        }
	}
}
