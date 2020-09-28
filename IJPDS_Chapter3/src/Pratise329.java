public class Pratise329 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	print("Enter circle1's center x-, y-coordinates, and radius:");
    	double x1 = in.nextDouble();
    	double y1 = in.nextDouble();
    	double radius1 = in.nextDouble();

    	print("Enter circle2's center x-, y-coordinates, and radius:");
    	double x2 = in.nextDouble();
    	double y2 = in.nextDouble();
    	double radius2 = in.nextDouble();

        double distance = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
        if (distance > radius1 + radius2) {
        	print("circle 2 does not overlap circle1");
        } else if (distance > Math.abs(radius1 - radius2) && distance < Math.abs(radius1 + radius2)) {
        	print("circle 2 overlap circle1");
        } else if (distance <= Math.abs(radius1 - radius2)) {
        	if (radius1 > radius2) {
            	print("circle 2 is inside circle1");
        	} else {
            	print("circle 1 is inside circle2");
        	}
        }
    }
}
