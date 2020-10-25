/**
 * 练习 5.19: 打印金字塔形的数字
 * @author integrate
 */
public class MyPratise519 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		this.print("Enter the number of lines:");
        int numOfLines = in.nextInt();
        if (numOfLines <= 0) {
        	print("Number of lines must be greater than 0");
        	System.exit(-1);
        }

        for (int i = 0; i < numOfLines; ++i) {
        	for (int j = 0; j <  numOfLines + i; ++ j) {
        		if (j >= numOfLines - i - 1&&  j < numOfLines + i) {
        			if (j < numOfLines) {
            			System.out.printf("%5d", (int) Math.pow(2, j + i - (numOfLines - 1)));
        			} else {
            			System.out.printf("%5d", (int) Math.pow(2, (numOfLines - 1 + i) - j));
        			}

        		} else {
        			System.out.printf("%5s", "");
        		}
        	}
        	System.out.println("");
        }
    }
}
