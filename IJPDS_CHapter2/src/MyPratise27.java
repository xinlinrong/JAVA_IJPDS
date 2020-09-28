import java.util.Scanner;

public class MyPratise27 implements IPratise {

	private final int DAYS_PER_YEAR = 365;
	private final int MINTES_PER_DAY = 1440;
	
	/**
     * 计算出年数
     */
	public void run()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of minute:");
        long minutes = in.nextLong();
        long years = minutes / (MINTES_PER_DAY  * DAYS_PER_YEAR);
        long days = (minutes - (years * MINTES_PER_DAY * DAYS_PER_YEAR)) / MINTES_PER_DAY;
        System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, years, days);
        in.close();
    }
}
