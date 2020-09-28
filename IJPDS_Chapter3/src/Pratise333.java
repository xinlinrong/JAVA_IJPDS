public class Pratise333 extends AbstractPratiseImpl {
    /**
     * 金融: 比较成本
     */
	@Override
    public void run()
    {
    	print("Enter weight and price for package 1:");
    	double weight1 = in.nextDouble();
    	double price1 = in.nextDouble();

    	print("Enter weight and price for package 2:");
    	double weight2 = in.nextDouble();
    	double price2 = in.nextDouble();

        double avg1 = price1/weight1;
        double avg2 = price2/weight2;

        if (avg1 < avg2) {
        	print("Package 1 has a better price");
        } else if (avg1 > avg2) {
        	print("Package 2 has a better price");
        } else {
        	print("Two packages have the same price");
        }
    }
}
