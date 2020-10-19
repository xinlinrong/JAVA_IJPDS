/**
 * 习题 5.1 统计正数和负数的个数然后计算这些数的平均值
 * @author integrate
 */
public class MyPratise51 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	int readNum = 0, total = 0;
    	int posCount = 0, nagCount = 0;
    	this.print("Enter an integer, the input ends if it is 0:");
        while((readNum = in.nextInt()) != 0)  {
        	total += readNum;
        	if (readNum > 0) {
        		posCount += 1;
        	} else {
        		nagCount += 1;
        	}
        }

        if (posCount == 0 && nagCount == 1) {
        	this.print("No numbes are entered except 0");
        	System.exit(-1);
        }
        
    	double average = total * 1.0 / (posCount + nagCount);
        this.print("The number of positives is %d", posCount);
        this.print("The number of nagatives is %d", nagCount);
        this.print("The total is %d", total);
        this.print("The average is %.2f", average);
    }
}
