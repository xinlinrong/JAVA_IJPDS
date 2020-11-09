/**
 * ��ϰ6.19: ������
 * @author integrate
 */
public class MyPractise619 extends AbstractPratiseImpl {

	/**
	 * �ж��������Ƿ�����������
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
	 * ���������ε����
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
