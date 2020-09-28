public class Pratise323 extends AbstractPratiseImpl {
    private final double WIDTH_OF_RECTANGLE = 10.0;
    private final double HEIGHT_OF_RECTANGLE = 5.0;
	
	@Override
    public void run()
    {
    	print("Enter a point with two coordinates:");
    	double coordx = in.nextDouble();
    	double coordy = in.nextDouble();

        if (Math.abs(coordx) < (WIDTH_OF_RECTANGLE/2.0)
       && Math.abs(coordy) < (HEIGHT_OF_RECTANGLE/2.0))
        {
        	print("point (%f, %f) is in the rectangle.");
        } else {
        	print("point (%f, %f) is not in the rectangle.");
        }
    }
}
