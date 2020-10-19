/**
 * 练习 4.2 几何: 最大圆距离
 * @author integrate
 *
 */
public class MyPratise42 extends AbstractPratiseImpl {
    final public double RADIUS_OF_EARCH = 6371.01;
	
    /**
     * 根据角度计算
     * @param degreeX1
     * @param degreeY1
     * @param degreeX2
     * @param degreeY2
     * @return
     */
    public static double calcDistanceByDegree(
    		double radius,
    		double degreeX1,
    		double degreeY1,
    		double degreeX2,
    		double degreeY2
    )
    {
    	return calcDistanceByRadian(
    			radius, Math.toRadians(degreeX1), Math.toRadians(degreeY1), 
    			Math.toRadians(degreeX2), Math.toRadians(degreeY2));
    }
    
    public static double calcDistanceByRadian(
    		double radius,
    		double radianX1,
    		double radianY1,
    		double radianX2,
    		double radianY2
    )
    {
        double tempResult = Math.sin(radianX1) * Math.sin(radianX2);
        tempResult += Math.cos(radianX1) * Math.cos(radianX2) * Math.cos(radianY1 - radianY2);
        
        return (radius * Math.acos(tempResult));
        
    }
    
	@Override
    public void run()
    {
    	this.print("Enter point 1 (latitude and longitude) in degrees:");
    	double degreeX1 = this.in.nextDouble();
    	double degreeY1 = this.in.nextDouble();

    	this.print("Enter point 2 (latitude and longitude) in degrees:");
    	double degreeX2 = this.in.nextDouble();
    	double degreeY2 = this.in.nextDouble();
        
        double distance = calcDistanceByDegree(RADIUS_OF_EARCH, degreeX1, degreeY1, degreeX2, degreeY2);
        this.print("The distance between two points is %f", distance);
    }
}
