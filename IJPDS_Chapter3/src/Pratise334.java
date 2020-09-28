public class Pratise334 extends AbstractPratiseImpl {
	/**
	 * 几何: 线段上的点
	 */
    @Override
    public void run()
    {
    	print("Enter three points for p0, p1, p2:");
    	double x0 = in.nextDouble();
    	double y0 = in.nextDouble();
    	double x1 = in.nextDouble();
    	double y1 = in.nextDouble();
    	double x2 = in.nextDouble();
    	double y2 = in.nextDouble();

        double value = (x1 - x0) * (y2 - y0) - (x2-x0) * (y1 - y0);
         if (value != 0) {
        	 print("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
         } else {
        	 print("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
         }
    }
}
