public class Pratise322 extends AbstractPratiseImpl {
	
	private final double RADIUS_OF_CIRCLE = 10.0;
    private final double COORD_X_OF_ZERO = 0.0;
    private final double COORD_Y_OF_ZERO = 0.0;
	
    @Override
    public void run()
    {
    	print("Enter a point with two coordinates:");
    	double coordx = in.nextDouble();
    	double coordy = in.nextDouble();

        double distance = Math.pow(Math.pow(coordx - COORD_X_OF_ZERO, 2) + Math.pow(coordy - COORD_Y_OF_ZERO, 2), 0.50);
        if (distance < RADIUS_OF_CIRCLE) {
        	print("point (%f, %f) is in the circle.");
        } else {
        	print("point (%f, %f) is not in the circle.");
        }
    }
}
