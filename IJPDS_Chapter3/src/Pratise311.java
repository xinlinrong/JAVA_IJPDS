
public class Pratise311 extends AbstractPratiseImpl {

	/**
	 * 根据月份获取对应的英文
	 * @param month
	 * @return String
	 */
	private String getMonthStr(int month)
	{
		String monthStr = "";
    	switch (month) {
	    	case 1: monthStr = "January"; break;
	    	case 2: monthStr = "February"; break;
	    	case 3: monthStr = "March"; break;
	    	case 4: monthStr = "April"; break;
	    	case 5: monthStr = "May"; break;
	    	case 6: monthStr = "June"; break;
	    	case 7: monthStr = "July"; break;
	    	case 8: monthStr = "August"; break;
	    	case 9: monthStr = "September"; break;
	    	case 10: monthStr = "October"; break;
	    	case 11: monthStr = "November"; break;
	    	case 12: monthStr = "December"; break;	    		
    	}
    	return monthStr;
    }
	
	/**
	 * 判断是否是闰年
	 * @param year
	 * @return boolean
	 */
	private boolean isLoopyear(int year)
	{
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0));
	}
	
	/**
	 * 获取当月最大的天数
	 * @param year
	 * @param month
	 */
	private int getMaxDayOfMonth(int year, int month)
	{
		int maxDays = 0;
		switch (month) {
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	maxDays = 31;
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	maxDays = 30;
		    	break;
		    case 2:
		    	maxDays = isLoopyear(year) ? 29 : 28;
		    	break;
		}
		return maxDays;
	}
	
	@Override
    public void run()
    {
    	print("Enter the year (> 0):");
    	int year = in.nextInt();
    	
    	print("Enter the month (1-12):");
    	int month = in.nextInt();

        String monthStr = getMonthStr(month);
        int maxDays = getMaxDayOfMonth(year, month);
        print("%s %d has %d days", monthStr, year, maxDays);
    }
}
