/**
 * 练习 4.5 几何.正多边形的面积
 * @author integrate
 */
public class MyPratise45 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	this.print("Enter the number of sides:");
    	int sides = in.nextInt();
    	this.print("Enter the side:");
    	double sideLength = in.nextDouble();
    	double area = sides * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI/sides));
    	this.print("The area of the polygon is %f", area);
    }
}
