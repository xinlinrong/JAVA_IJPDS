import java.util.Scanner;
public class MyPratise23 implements IPratise {

	public final double FEET_MILES = 0.305;
	
	/**
	 * 将英尺转换为米
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a number for feet: ");
    	double feets = in.nextDouble();
    	double meters = feets * FEET_MILES;
        System.out.printf("%.4f feet is %.4f meters", feets, meters);
        System.out.println("");
        in.close();
        return;
    }
}
