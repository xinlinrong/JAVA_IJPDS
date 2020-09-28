import java.util.Scanner;

public class MyPratise211 implements IPratise {
	protected final int BORN_ONE_IN_SECONDS = 7;
	protected final int DIE_ONE_IN_SECONDS = 13;
	protected final int MIGRATE_ONE_IN_SECONDS = 45;
    protected final int DAYS_PER_YEAR = 365;
    protected final int SECONDS_PER_DAY = 86400;
    protected final long INITIAL_POPULATION = 312_032_486;
    
    /**
     * 人口统计
     */
    public void run()
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of years:");
        int years = in.nextInt();
        long totalSeconds = years  * DAYS_PER_YEAR * SECONDS_PER_DAY; 
        long borns = totalSeconds / BORN_ONE_IN_SECONDS;
        long dies = totalSeconds / DIE_ONE_IN_SECONDS;
        long migrate = totalSeconds / MIGRATE_ONE_IN_SECONDS;
        long total = INITIAL_POPULATION + borns + migrate - dies;
        System.out.printf("The population in %d years is %d.", years, total);
        in.close();
    }
}
