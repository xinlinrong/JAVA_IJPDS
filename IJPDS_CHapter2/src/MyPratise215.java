import java.util.Scanner;
public class MyPratise215 implements IPratise {
	/**
	 * 几何:两点间距离
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter x1 and y1:");
    	double x1 = in.nextDouble();
    	double y1 = in.nextDouble();
    	System.out.print("Enter x2 and y2");
    	double x2 = in.nextDouble();
    	double y2 = in.nextDouble();
    	double distance = Math.pow(Math.pow((x2-x1), 2) + Math.pow(y2-y1, 2), 0.5);
    	System.out.printf("The distance between two points is %.4f", distance);
    	in.close();
    }
}
