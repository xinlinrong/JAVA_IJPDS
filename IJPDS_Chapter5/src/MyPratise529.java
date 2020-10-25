/**
 * 练习 5.29: 显示日历
 * @author integrate
 */
public class MyPratise529  extends AbstractPratiseImpl  {

	/**
	 * 根据月份获取每月的天数
	 * @param month
	 * @return
	 */
	public int getDaysOfMonth(int year, int month)
	{
		boolean isLoopYear = false;
		if ((year % 4 == 0 && year %100 != 0) || (year % 400 == 0 && year %100 == 0)) {
			isLoopYear = true;
		}

		int days = 0;
	    switch (month) {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	    	days = 31; break;
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	    	days = 30; break;
	    case 2:
	    	days = (isLoopYear) ? 29 : 28; break;
	    }

	    return days;
	}
	
	/**
	 * 获取月份对应的英文
	 * @param month
	 * @return
	 */
    public String getMonthStr(int month)
    {
    	String monthStr = "";
    	switch (month) {
    	case 1:
    		monthStr = "January"; break;
    	case 2:
    		monthStr = "Frebary"; break;
    	case 3:
    		monthStr = "March"; break;
    	case 4:
    		monthStr = "Apirl"; break;
    	case 5:
    		monthStr = "May"; break;
    	case 6:
    		monthStr = "June"; break;
    	case 7:
    		monthStr = "July"; break;
    	case 8:
    		monthStr ="Auguest"; break;
    	case 9:
    		monthStr = "September"; break;
    	case 10:
    		monthStr = "October"; break;
    	case 11:
    		monthStr ="November"; break;
    	case 12:
    		monthStr = "December"; break;
    	}
    	return monthStr;
    }
	
    /**
     * 获得星期几
     * @param day
     */
	public String getWeekDay(int day)
	{
		String weekdayStr = "";
		switch (day) {
		case 0:
			weekdayStr = "Sunday"; break;
		case 1:
			weekdayStr = "Monday"; break;
		case 2:
			weekdayStr = "Tuesday"; break;
		case 3:
			weekdayStr = "Wednesday"; break;
		case 4:
			weekdayStr = "Thursday"; break;
		case 5:
			weekdayStr = "Friday"; break;
		case 6:
			weekdayStr = "Saturday"; break;
		}
		return weekdayStr;
	}
    
	@Override
	public void run()
	{
		print("Enter the year:");
		int year = in.nextInt();
        print("The first day of year %d is (0: Sun, 1: Mon, 2: Tue, 3: Wed, 4: Thu, 5: Fri, 6: Sat):");
        int day = in.nextInt();

        int lastDay = day;
        int daysOfMonth = 0;
    	for (int i = 1; i <= 12; ++ i) {
    		print("-------------------------------%-13s-------------------------------------------------------", getMonthStr(i) + " " + Integer.toString(year));
    		print("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", 
    				getWeekDay(0), getWeekDay(1), getWeekDay(2), getWeekDay(3), 
    				getWeekDay(4), getWeekDay(5), getWeekDay(6));
    		for (int j = 0; j < lastDay; ++ j) {
    			System.out.printf("%-15s", "");
    		}
    		daysOfMonth = getDaysOfMonth(year, i);
            for (int j = 1; j <= daysOfMonth; ++ j) {
            	if ((j + lastDay) % 7 == 0) {
        			System.out.printf("%-15s\n", j);
            	} else {
        			System.out.printf("%-15s", j);
            	}
            }
    		System.out.println("");
    		lastDay = (lastDay + getDaysOfMonth(year, i)) % 7;
        }
	}
}
