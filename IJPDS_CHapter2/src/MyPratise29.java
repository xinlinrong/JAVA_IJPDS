import java.util.Scanner;

public class MyPratise29 implements IPratise {
	/**
	 * 物力: 加速度
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter v0, v1 and t:");
    	double v0 = in.nextDouble();
    	double v1 = in.nextDouble();
    	double t = in.nextDouble();
    	System.out.printf("The average acceleration is %.4f", (v1 - v0)/t);
    	in.close();
    }
}
