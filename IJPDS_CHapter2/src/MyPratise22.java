import java.util.Scanner;

public class MyPratise22 implements IPratise {

	/**
	 * 计算圆柱体体积
	 */
	public void run()
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter the redius and length of a cylinder");
        double radius = in.nextDouble();
        double length = in.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double volume = area * length;
        System.out.printf("The area is %.4f", area);
        System.out.println("");
        System.out.printf("The volume is %.4f", volume);
        System.out.println("");
        in.close();
    }
}
