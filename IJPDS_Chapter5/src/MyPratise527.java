/**
 * 练习 5.27: 显示闰年
 * @author integrate
 */
public class MyPratise527 extends AbstractPratiseImpl {

	/**
	 * 判断是否是闰年
	 * @param year
	 * @return
	 */
	public boolean isLoopYear(int year)
	{
		boolean isLoop = false;
        if ((year % 4 == 0 && year % 100 != 0)
        ||(year % 100 == 0 && year % 400 == 0)) {
        	isLoop = true;
        }
		return isLoop;
	}
	
	@Override
    public void run()
    {
		int columnNums = 0;
        for (int i = 101; i <= 2100; ++i) {
        	if (isLoopYear(i)) {
        		columnNums += 1;
                if (columnNums % 10 == 0) {
                	columnNums = 0;
                	System.out.printf("%-5d\n", i);
                } else {
                	System.out.printf("%-5d ", i);
                }
        	}
        }
    }
}
