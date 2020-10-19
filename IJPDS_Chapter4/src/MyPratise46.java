/**
 * 练习 4.6 圆上的随即点
 * @author integrate
 */
public class MyPratise46 extends AbstractPratiseImpl {

	/**
	 * 计算两点之间的距离
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	private double getDistanceFormPoints(
		double x1, double y1,
		double x2, double y2
	)
	{
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}

	@Override
    public void run()
    {
    	// A 点
    	double angleA = Math.PI * 2 * Math.random();
        double coordXOfA = Math.cos(angleA);
        double coordYOfA = Math.sin(angleA);

        //  B 点
    	double angleB = Math.PI * 2 * Math.random();
        double coordXOfB = Math.cos(angleB);
        double coordYOfB = Math.sin(angleB);

        // C 点
    	double angleC = Math.PI * 2 * Math.random();
        double coordXOfC = Math.cos(angleC);
        double coordYOfC = Math.sin(angleC);

        double lineA = getDistanceFormPoints(coordXOfB, coordYOfB, coordXOfC, coordYOfC);
        double lineB = getDistanceFormPoints(coordXOfA, coordYOfA, coordXOfC, coordYOfC);
        double lineC = getDistanceFormPoints(coordXOfA, coordYOfA, coordXOfB, coordYOfB);

        this.print("lineA of A is %f", lineA);
        this.print("lineB of B is %f", lineB);
        this.print("lineC of C is %f", lineC);
        
        double angleOfA = Math.acos((Math.pow(lineA, 2) - Math.pow(lineB, 2) - Math.pow(lineC, 2)) / (-2 * lineB * lineC));
        double angleOfB = Math.acos((Math.pow(lineB, 2) - Math.pow(lineA, 2) - Math.pow(lineC, 2)) / (-2 * lineA * lineC));
        double angleOfC = Math.acos((Math.pow(lineC, 2) - Math.pow(lineA, 2) - Math.pow(lineB, 2)) / (-2 * lineA * lineB));

        this.print("Angel of A is %f", Math.toDegrees(angleOfA));
        this.print("Angel of B is %f", Math.toDegrees(angleOfB));
        this.print("Angel of B is %f", Math.toDegrees(angleOfC));
    }
}
