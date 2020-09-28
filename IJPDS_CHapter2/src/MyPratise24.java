import java.util.Scanner;

public class MyPratise24 implements IPratise {

	public final double POUNDS_PER_KILOGRAM = 0.454;
	
	/**
	 * 将磅转换为千克
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a number in pounds:");
    	double pounds = in.nextDouble();
    	double kilograms = pounds * POUNDS_PER_KILOGRAM;
    	System.out.printf("%f pounds us %.3f kilograms", pounds, kilograms);
        System.out.println();
        in.close();
    }
}
