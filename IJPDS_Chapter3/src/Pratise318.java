public class Pratise318 extends AbstractPratiseImpl {
    /**
     * ‘À ‰≥…±æ
     */
	@Override
    public void run()
    {
    	print("Please enter your package wieght:");
    	double weight = in.nextDouble();
        if (weight <= 0) {
        	print("Invalid input");
        	System.exit(-1);
        } else if (weight > 20) {
        	print("the package cannot be shipped");
        	System.exit(-1);
        }
        
    	double shipCost = 0.00;
        if (weight > 10) {
        	shipCost = 10.5;
        } else if (weight > 3) {
        	shipCost = 8.5;
        } else if (weight > 1) {
        	shipCost = 5.5;
        } else {
        	shipCost = 3.5;
        }

        print("It cost you %.2f", shipCost);
    }
}
