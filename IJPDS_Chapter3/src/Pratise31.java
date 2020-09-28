
public class Pratise31 extends AbstractPratiseImpl {

	/**
	 * 代数:解一元二次方程
	 */
	@Override
	public void run()
	{
		this.print("Enter a, b, c:");
        double aVal = this.in.nextDouble();
        double bVal = this.in.nextDouble();
        double cVal = this.in.nextDouble();

	    double judgeVal = Math.pow(bVal, 2) - (4 * aVal * cVal); 
        if (judgeVal > 0) {
        	double root1 = (Math.pow(judgeVal, 0.5) - bVal) / (2 * aVal);
        	double root2 = (0 - Math.pow(judgeVal, 0.5) - bVal) / (2 * aVal);
        	this.print("The equation has two roots %.6f and %.6f", root1, root2);
        } else if (Math.abs(judgeVal - 0.0) < 1E-14) {
        	double root1 = (Math.pow(judgeVal, 0.5) - bVal) / (2 * aVal);
        	this.print("The equation has one root %.6f", root1);
        } else {
        	this.print("The equation has no real roots");
        }
        return;
	}
}
