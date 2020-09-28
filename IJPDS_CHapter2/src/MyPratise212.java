import java.util.Scanner;

public class MyPratise212 implements IPratise {
    /**
     * 加速度计算
     */
	public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter the speed and acceleration:");
    	double speed = in.nextDouble();
    	double acceleration = in.nextDouble();
        double length = Math.pow(speed, 2) / (2 * acceleration);
        System.out.printf("The minimum runway length for this airplane is %.3f", length);
        in.close();
    }
}
