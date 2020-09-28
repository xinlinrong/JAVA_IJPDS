public class Pratise328 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	print("Enter  r1's center x-, y-coordinates, width, height:");
    	double x1 = in.nextDouble();
    	double y1 = in.nextDouble();
    	double width1 = in.nextDouble();
    	double height1 = in.nextDouble();

    	print("Enter  r2's center x-, y-coordinates, width, height:");
    	double x2 = in.nextDouble();
    	double y2 = in.nextDouble();
    	double width2 = in.nextDouble();
    	double height2 = in.nextDouble();

        // 计算数值判定两个图形的物理关系
        double distanceX = Math.abs(x2 - x1);
        double distanceY = Math.abs(y2 - y1);
        if (distanceX > (width1 + width2)/2.0 || distanceY > (height1 + height2)/2.0) {
        	print("r2 does not overlap r1");
        } else if (distanceX <= Math.abs(width1 - width2)/2.0 && distanceY <= Math.abs(height1 - height2)/2.0) {
            if (width1 > width2 && height1 > height2) {
        	    print("r2 is inside r1");
            } else {
        	    print("r1 is inside r2");
            }
        } else {
        	print("r2 overlap r1");
        }
    }
}
