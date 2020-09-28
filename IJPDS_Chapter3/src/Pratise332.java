public class Pratise332 extends AbstractPratiseImpl {
	/**
	 * 几何: 点的位置
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
         if (value > 0) {
        	 print("p2 is on the left side of the line");
         } else if (value < 0) {
        	 print("p2 is on the right side of the line");
         } else {
        	 print("p2 is on the same line");
         }
    }
}
