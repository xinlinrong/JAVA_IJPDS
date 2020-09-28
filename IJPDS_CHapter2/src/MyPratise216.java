import java.util.Scanner;

public class MyPratise216 implements IPratise {

	protected final double FACTOR = 3 * Math.pow(3, 0.5) / 2;
	
	/**
	 * 几何: 六边形面积
	 */
    public void run()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the side:");
        double length = in.nextDouble();
        double area = Math.pow(length, 2) * FACTOR;
        System.out.printf("The area of hexagon is %.4f", area);
        in.close();
    }
}
