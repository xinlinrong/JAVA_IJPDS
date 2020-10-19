/**
 * 练习 4.3 几何.六边形面积
 * @author integrate
 *
 */
public class MyPratise44 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		this.print("Enter the side:");
		double lengthOfSide = this.in.nextDouble();
		double area = (6 * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI/6));
		this.print("The area of the hexagon is %.2f", area);
	}
}