import java.util.Scanner;

public class MyPratise214 implements IPratise{
    
	protected final double POUNDS_PER_KILOGRAM = 0.45359237;
	protected final double INCHES_PER_METERS = 0.0254;
	
	/**
	 * Ω°øµ”¶”√: º∆À„ BMI
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double pounds = in.nextDouble();
        System.out.print("Enter height in inches");
        double inches = in.nextDouble();
        double weight = pounds * POUNDS_PER_KILOGRAM;
        double height = inches * INCHES_PER_METERS;
        double pmiValue = weight / Math.pow(height, 2);
        System.out.printf("BMI is %.4f", pmiValue);
        in.close();
    }
}
