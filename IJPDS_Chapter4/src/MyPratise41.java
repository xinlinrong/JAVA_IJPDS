/**
 * 练习 4.1 几何: 五边形的面积
 * @author integrate
 */
public class MyPratise41 extends  AbstractPratiseImpl {
	@Override
    public void run()
    {
    	this.print("Enter the length from the center to a vertex");
    	Double radius = this.in.nextDouble();
    	Double s =  2 * radius * Math.sin(Math.PI/5);
    	Double area = 5 * Math.pow(s, 2.0) / (4 * Math.tan(Math.PI/5));
        this.print("The area of pentagon is %.2f", area);
    }
}
