public class Pratise325 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	print("Enter x1, y1, x2, y2, x3, y3, x4, y4:");

    	// 获取 x1, y1
    	double x1 = in.nextDouble();
    	double y1 = in.nextDouble();

    	// 获取 x2, y2
    	double x2 = in.nextDouble();
    	double y2 = in.nextDouble();

    	// 获取 x3, y3
    	double x3 = in.nextDouble();
    	double y3 = in.nextDouble();

    	// 获取 x4, y4
    	double x4 = in.nextDouble();
    	double y4 = in.nextDouble();

    	double expVarA = (y1 - y2);
    	double expVarB = (x1 - x2);
    	double expVarE = expVarA * x1 - expVarB * y1;

        double expVarC = (y3 - y4);
        double expVarD = (x3 - x4);
        double expVarF = expVarC * x3 - expVarD * y3;

        if (Math.abs(expVarA * expVarD - expVarB * expVarC)<1E-14) {
        	print("The two line are parallel.");
        	System.exit(-1);
        }

        double xValue = (expVarE * expVarD - expVarB * expVarF)/(expVarA * expVarD - expVarB * expVarC);
        double yValue = (expVarA * expVarF - expVarE * expVarC)/(expVarA * expVarD - expVarB * expVarC);
        print("The intersecting point is at (%.5f, %.4f)", xValue, yValue);
    }
}
