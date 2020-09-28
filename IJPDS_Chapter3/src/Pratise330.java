public class Pratise330 extends AbstractPratiseImpl {
	private final int SECOND_PER_DAYS = 86400;
    private final int SECOND_PER_HOUR = 3600;
    private final int MINUTE_PER_HOUR = 60;
    private final int SECOND_PER_MINUTE = 60;
	private final int HOUR_PER_DAY = 24;
    
	/** 
	 * 当前时间
	 */
	public void run()
	{
        print("Enter the timezone offset to GMT:");
        int timeZoneOffset = in.nextInt();
        long currentTime = System.currentTimeMillis() / 1000;
        long second = currentTime % SECOND_PER_MINUTE;
        long minute = (currentTime % SECOND_PER_HOUR) / SECOND_PER_MINUTE;
        long hour = (currentTime / SECOND_PER_HOUR) % HOUR_PER_DAY;
        hour = (hour + HOUR_PER_DAY + timeZoneOffset) % HOUR_PER_DAY;
        print("The current time is %d:%d:%d %s", hour%12, minute, second, (hour < 12) ? "AM" : "PM");
	}
}
