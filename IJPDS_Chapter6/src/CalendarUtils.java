import java.lang.System;

/**
 * 时间函数
 * @author integrate
 */
public class CalendarUtils {

	/**
     * 初始化年
     */
	public final static int BEGIN_YEAR = 1970;
	
	/**
	 * 毫秒级别时间戳
	 */
	private long milliSeconds = 0;

	/**
	 * 当前毫秒
	 */
	private long currentMilliSeconds = 0;
	
	/**
	 * 当前秒
	 */
	private long currentSeconds = 0;
	
	/**
	 * 当前分钟
	 */
	private long currentMinutes = 0;
	
	/**
	 * 当前小时
	 */
	private long currentHours = 0;
	
	/**
	 * 当前天数
	 */
	private long currentDay = 1;
	
	/**
	 * 当前月份
	 */
	private long currentMonth = 1;
	
	/**
	 * 当前年份
	 */
	private long currentYear = BEGIN_YEAR;
	
	/**
	 * 构造函数
	 */
	public CalendarUtils()
	{
		this.milliSeconds = System.currentTimeMillis();
		initCalendarUtils();
	}
	
	/**
	 * 带有参数的构造函数
	 * @param milliSeconds
	 */
	public CalendarUtils(long milliSeconds)
	{
		this.milliSeconds = milliSeconds;
		initCalendarUtils();
	}

	/**
	 * 初始化
	 */
	private void initCalendarUtils()
	{
		this.currentMilliSeconds = this.milliSeconds % 1000;

		// 获取总分秒
	    long totalSeconds = this.milliSeconds / 1000;
	    this.currentSeconds = totalSeconds % 60;

	    // 获取总分钟数
	    long totalMinutes = totalSeconds / 60;
        this.currentMinutes = totalMinutes % 60;

        // 获取总小时数
	    long totalHours = totalMinutes / 60;
	    this.currentHours = totalHours % 24;

	    // 获取总天数
        long totalDays = totalHours / 24;

        long restDays = totalDays;
	    while (restDays >= getMaxDaysFormYear(this.currentYear)) {
	        restDays -= getMaxDaysFormYear(this.currentYear);
	    	++this.currentYear;
	    }

	    while (restDays >= getMaxMonthDays(this.currentYear, this.currentMonth)) {
	        restDays -= getMaxMonthDays(this.currentYear, this.currentMonth);
	    	++this.currentMonth;
	    }
	    
	    this.currentDay += restDays;
	}
	
	/**
	 * 获取当前毫秒
	 * @return long
	 */
	public long getMilliSeconds()
	{
		return milliSeconds;
	}
	
	/**
     * 获取当前秒
     * @return long
     */
	public long getCurrentSeconds() {
    	return currentSeconds;
    }

	/**
	 * 获取当前的分钟数
	 * @return long
	 */
    public long getCurrrentMinutes() {
    	return currentMinutes;
    }

    /**
     * 获取当前小时数
     * @return
     */
    public long getCurrentHours() {
    	return currentHours;
    }

    /**
     * 获取天
     * @return
     */
    public long getCurrentDay() {
    	return currentDay;
    }
    
    /**
     * 获取月份
     * @return
     */
    public long getCurrentMonth() {
    	return currentMonth;
    }

    /**
     * 获取年份
     * @return
     */
    public long getCurrentYear() {
    	return currentYear;
    }
    
    /**
     * 判断是否是闰年
     * @param year
     * @return boolean
     */
    public static boolean isLoopYear(long year)
    {
    	return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    /**
     * 根据是否是闰年获取当年的天数
     * @param year
     * @return
     */
    public static long getMaxDaysFormYear(long year)
    {
    	return (isLoopYear(year)) ? 366 : 365;
    }
    
    /**
     * 通过月份获取对应的天数
     * @param month
     * @return
     */
    public static long getMaxMonthDays(long year, long month)
    {
    	long days = 0;
    	switch ((int)month) {
    	case 1:
    	case 3:
    	case 5:
    	case 7:
    	case 8:
    	case 10:
    	case 12:
    		days = 31;
    		break;
    	case 2:
    		days = isLoopYear(year) ? 29 : 28;
    		break;
    	default:
    		days = 30;
    		break;
    	}
    	return days;
    }

    /**
     * 通过数字获取月份的英文名
     * @param month
     * @return
     */
   public static String getMonthShortStr(int month)
   {
	   String monthShortName = ""; 
	   switch (month) {
		   case 1: monthShortName = "Jan"; break;
		   case 2: monthShortName = "Feb"; break;
		   case 3: monthShortName = "Mar"; break;
		   case 4: monthShortName = "Apr"; break;
		   case 5: monthShortName = "May"; break;
		   case 6: monthShortName = "Jun"; break;
		   case 7: monthShortName = "Jul"; break;
		   case 8: monthShortName = "Aug"; break;
		   case 9: monthShortName = "Sept"; break;
		   case 10: monthShortName = "Oct"; break;
		   case 11: monthShortName = "Nov"; break;
		   case 12: monthShortName = "Dec"; break;
	   }
	   return monthShortName;
   }

  /**
    * 根据年月日获取每月第一天是星期几
    * @param year
    * @param month
    * @param day
    * @return
    */
   public static int getWeekDayFormDay(int year, int month, int day)
   {
       if (month == 1 || month == 2) {
       	month += 12;
       	year -= 1;
       }

       int q = day;
       int k = year % 100;
       int j = year / 100;

       int dayOfWeek  = q;
       dayOfWeek += (26 * (month + 1) / 10);
       dayOfWeek += k;
       dayOfWeek += k / 4;
       dayOfWeek += j / 4;
       dayOfWeek += 5 * j;
       dayOfWeek %= 7;
       return dayOfWeek;
   }
}