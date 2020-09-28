import java.util.Scanner;

public class MyPratise219 implements IPratise {
	/**
	 * 几何: 三角形的面积
	 */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the coordinates of three points separated by spaces");
    	System.out.print("like x1 y1 x2 y2 x3 y3:");
    	double x1 = in.nextDouble();
    	double y1 = in.nextDouble();
    	double x2 = in.nextDouble();
    	double y2 = in.nextDouble();
    	double x3 = in.nextDouble();
    	double y3 = in.nextDouble();

        double s1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double s2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double s3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double s = (s1 + s2 + s3)/2.0;
        double area = Math.pow(s * (s-s1)*(s-s2)*(s-s3), 0.5);

        System.out.printf("The area of the triangle is %.1f", area);
        in.close();
    }
}
