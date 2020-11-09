/**
 * 练习6.19: 三角形
 * @author integrate
 */
public class MyPractise619 extends AbstractPratiseImpl {

	/**
	 * 判断三条线是否怎成三角形
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	public static boolean isValid(double side1, double side2, double side3)
	{
		return((side1 + side2) > side3 && (side2 + side3) > side1&& (side1 + side3) > side2);
	}

	/**
	 * 计算三角形的面积
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	public static double area(double side1, double side2, double side3)
	{
		double sides = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3));
	}

    @Override
    public void run()
    {
    	print("Enter side1");
    	double  side1 = in.nextDouble();

    	print("Enter side2");
    	double  side2 = in.nextDouble();

    	print("Enter side3");
    	double  side3 = in.nextDouble();

        if (!isValid(side1, side2, side3)) {
        	print("Side invalid");
        	return;
        }

        print("Area is: %.2f ", area(side1, side2, side3));
    }
}
