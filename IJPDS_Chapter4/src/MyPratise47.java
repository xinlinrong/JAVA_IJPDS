/**
 * 练习 4.7 圆上的随即点
 * @author integrate
 */
public class MyPratise47 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		this.print("Enter the radius of the bouding circle:");
		double radius = in.nextDouble();

	    int i = 0;
        double coordXOfPoint = 0.0;
        double coordYOfPoint = 0.0;
	    double radina = (Math.PI/2) - (Math.PI * 2/5);
        this.print("The coordinates of five points on the pentagon are:");
        for (i = 0; i < 5; ++ i) {
        	coordXOfPoint = Math.cos(radina) * radius;
        	coordYOfPoint = Math.sin(radina) * radius;
        	this.print("(%.2f, %.2f)", coordXOfPoint, coordYOfPoint);
        	radina += Math.PI * 2/5;            
	    }
	}
}