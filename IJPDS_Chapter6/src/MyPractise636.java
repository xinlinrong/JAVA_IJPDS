/**
 * ��ϰ6.36: ����: ������ε����
 * @author integrate
 */
public class MyPractise636 extends AbstractPratiseImpl {
	/**
	 * ����������ε����
	 * @param side
	 * @return
	 */
	public static double area(int n, double side)
	{
		return MathUtils.nPolygonArea(n, side);
	}
	
	@Override
    public void run()
    {
		print("Enter the number of side:");
		int n = in.nextInt();
    	print("Enter the side:");
        double side = in.nextDouble();
    	print("The are of the polygon is %f", area(n, side));
    }
}
