/**
 * ��ϰ6.35: ����: ����ε����
 * @author integrate
 */
public class MyPractise635 extends AbstractPratiseImpl {
	/**
	 * ��������ε����
	 * @param side
	 * @return
	 */
	public static double area(double side)
	{
		return MathUtils.nPolygonArea(5, side);
	}
	
	@Override
    public void run()
    {
    	print("Enter the side:");
    	print("The are of the pentagon is %f", area(in.nextDouble()));
    }
}
