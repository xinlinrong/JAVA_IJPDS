/**
 * 练习6.39 : 几何: 点的位置
 * @author integrate
 */
public class MyPractise639 extends AbstractPratiseImpl {
	/**
	 * 在直线的左边
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
    public static  boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)
    {
    	return ((x1 - x0) * (y2-y0) - (x2 - x0) * (y1 - y0) > 0);
    }

	/**
	 * 在直线的右边
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
    public static  boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)
    {
    	return ((x1 - x0) * (y2-y0) - (x2 - x0) * (y1 - y0) < 0);
    }

	/**
	 * 在直线上
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
    public static  boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2)
    {
    	boolean isSameLine = ((x1 - x0) * (y2-y0) - (x2 - x0) * (y1 - y0) == 0);

    	double distance1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2-x0, 2) + Math.pow(y2-y0, 2));
        double distance3 = Math.sqrt(Math.pow(x1-x0, 2) + Math.pow(y1-y0, 2));
        
        return (!(distance3 > distance1 || distance3 > distance2 ) && isSameLine);
    }

	/**
	 * 在直线上
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
    public static  boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2)
    {
    	boolean isSameLine = ((x1 - x0) * (y2-y0) - (x2 - x0) * (y1 - y0) == 0);

    	double distance1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2-x0, 2) + Math.pow(y2-y0, 2));
        double distance3 = Math.sqrt(Math.pow(x1-x0, 2) + Math.pow(y1-y0, 2));
        
        return ((distance3 > distance1 || distance3 > distance2 ) && isSameLine);
    }
    
	@Override
    public void run()
    {
		print("Enter three points for p0, p1 and p2:");
		double x0 = in.nextDouble();
		double y0 = in.nextDouble();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
        	print("(%f, %f) is on the left side of the line from (%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);
        } else if (rightOfTheLine(x0, y0, x1, y1, x2, y2)) {
        	print("(%f, %f) is on the right side of the line from (%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);	
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
        	print("(%f, %f) is on the same line from (%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);
        } else if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
        	print("(%f, %f) is on the line segment from (%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);
        }
    }
}
