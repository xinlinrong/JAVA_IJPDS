/**
 * 练习 4.3 几何.估算面积
 * @author integrate
 *
 */
public class MyPratise43 extends AbstractPratiseImpl {
    final public double RADIUS_OF_EARCH = 6371.01 * 1000;
	/**
	 * 计算三角形面积
	 * @param s1
	 * @param s2
	 * @param s3
	 * @return
	 */
	private double calcAngleArea(
			double s1,
			double s2,
			double s3
	)
	{
		double sTotal = (s1 + s2 + s3) / 2;
		return Math.sqrt(sTotal * (sTotal - s1) * (sTotal - s2) * (sTotal - s3));
    }
	
	/**
	 * 
	 * @return
	 */
	private double calcAngleAreaByPoints(
		double degreeXOfPointA,
		double degreeYOfPointA,
		double degreeXOfPointB,
		double degreeYOfPointB,
		double degreeXOfPointC,
		double degreeYOfPointC
	)
	{
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;

	    s1 = MyPratise42.calcDistanceByDegree(RADIUS_OF_EARCH, degreeXOfPointA, degreeYOfPointA, degreeXOfPointB, degreeYOfPointB);
	    s2 = MyPratise42.calcDistanceByDegree(RADIUS_OF_EARCH, degreeXOfPointA, degreeYOfPointA, degreeXOfPointC, degreeYOfPointC);
	    s3 = MyPratise42.calcDistanceByDegree(RADIUS_OF_EARCH, degreeXOfPointB, degreeYOfPointB, degreeXOfPointC, degreeYOfPointC);
	    
	    return calcAngleArea(s1, s2, s3);
	}
	
	@Override
    public void run()
    {
		// 亚特兰大
    	double degreeXOfAtlanta = 33.74879954;
    	double degreeYOfAtlanta = -84.3879824;

    	// 夏洛特
        double degreeXOfCharlotte = 35.2270869;
        double degreeYOfCharlotte = -80.8431267;

        // 奥兰多
        double degreeXOfOrlando = 28.5383355;
        double degreeYOfOrlando = -81.3792365;
        
        // 萨凡尼
        double degreeXOfSanvanah = 32.0835407;
        double degreeYOfSanvanah = -81.0998342;

        double area1 = calcAngleAreaByPoints(degreeXOfAtlanta, degreeYOfAtlanta, 
        		degreeXOfCharlotte, degreeYOfCharlotte, 
        		degreeXOfSanvanah, degreeYOfSanvanah);

        double area2 = calcAngleAreaByPoints(degreeXOfAtlanta, degreeYOfAtlanta, 
        		degreeXOfOrlando, degreeYOfOrlando, 
        		degreeXOfSanvanah, degreeYOfSanvanah);

        this.print("Total area is %f", (area1 + area2));
    }
}
