/**
 * 练习6.35: 几何: 五边形的面积
 * @author integrate
 */
public class MyPractise635 extends AbstractPratiseImpl {
	/**
	 * 计算五边形的面积
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
