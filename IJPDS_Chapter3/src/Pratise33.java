public class Pratise33 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	this.print("Enter a, b, c, d, e, f:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        double divNumber = a * d - b * c;
        if (Math.abs(divNumber) <= 1e-14) {
            this.print("The equation has no solution");
            return;
        } else {
        	double xVal = ((e * d) - (b * f)) / divNumber;
        	double yVal = ((a * f) - (e * c)) / divNumber;
            this.print("x is %.6f and y is %.6f", xVal, yVal);            
        }
    }
}
