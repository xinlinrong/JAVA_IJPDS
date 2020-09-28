public class Pratise327 extends AbstractPratiseImpl {
    /**
     * 几何: 点是否在三角形内
     */
	@Override
    public void run()
    {
		double k = -0.5, b = 100f; // 直线的斜率以及常量
        print("Enter a point's x- and y-coordinates:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        if (x1 < 0 || x1 >= 200) { // x 超出范围
        	print("The point is not in the triangle.");
        } else if ((k * x1 + b) < y1) { // 实际计算的 y 值小于 真实的 y1 值
        	print("The point is not in the triangle.");
        } else {
        	print("The point is in the triangle.");
        }
    }
}
