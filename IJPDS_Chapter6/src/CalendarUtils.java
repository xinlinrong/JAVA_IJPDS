import java.lang.System;

/**
 * ʱ�亯��
 * @author integrate
 */
public class CalendarUtils {

	/**
     * ��ʼ����
     */
	public final static int BEGIN_YEAR = 1970;
	
	/**
	 * ���뼶��ʱ���
	 */
	private long milliSeconds = 0;

	/**
	 * ��ǰ����
	 */
	private long currentMilliSeconds = 0;
	
	/**
	 * ��ǰ��
	 */
	private long currentSeconds = 0;
	
	/**
	 * ��ǰ����
	 */
	private long currentMinutes = 0;
	
	/**
	 * ��ǰСʱ
	 */
	private long currentHours = 0;
	
	/**
	 * ��ǰ����
	 */
	private long currentDay = 1;
	
	/**
	 * ��ǰ�·�
	 */
	private long currentMonth = 1;
	
	/**
	 * ��ǰ���
	 */
	private long currentYear = BEGIN_YEAR;
	
	/**
	 * ���캯��
	 */
	public CalendarUtils()
	{
		this.milliSeconds = System.currentTimeMillis();
		initCalendarUtils();
	}
	
	/**
	 * ���в����Ĺ��캯��
	 * @param milliSeconds
	 */
	public CalendarUtils(long milliSeconds)
	{
		this.milliSeconds = milliSeconds;
		initCalendarUtils();
	}

	/**
	 * ��ʼ��
	 */
	private void initCalendarUtils()
	{
		this.currentMilliSeconds = this.milliSeconds % 1000;

		// ��ȡ�ܷ���
	    long totalSeconds = this.milliSeconds / 1000;
	    this.currentSeconds = totalSeconds % 60;

	    // ��ȡ�ܷ�����
	    long totalMinutes = totalSeconds / 60;
        this.currentMinutes = totalMinutes % 60;

        // ��ȡ��Сʱ��
	    long totalHours = totalMinutes / 60;
	    this.currentHours = totalHours % 24;

	    // ��ȡ������
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
	 * ��ȡ��ǰ����
	 * @return long
	 */
	public long getMilliSeconds()
	{
		return milliSeconds;
	}
	
	/**
     * ��ȡ��ǰ��
     * @return long
     */
	public long getCurrentSeconds() {
    	return currentSeconds;
    }

	/**
	 * ��ȡ��ǰ�ķ�����
	 * @return long
	 */
    public long getCurrrentMinutes() {
    	return currentMinutes;
    }

    /**
     * ��ȡ��ǰСʱ��
     * @return
     */
    public long getCurrentHours() {
    	return currentHours;
    }

    /**
     * ��ȡ��
     * @return
     */
    public long getCurrentDay() {
    	return currentDay;
    }
    
    /**
     * ��ȡ�·�
     * @return
     */
    public long getCurrentMonth() {
    	return currentMonth;
    }

    /**
     * ��ȡ���
     * @return
     */
    public long getCurrentYear() {
    	return currentYear;
    }
    
    /**
     * �ж��Ƿ�������
     * @param year
     * @return boolean
     */
    public static boolean isLoopYear(long year)
    {
    	return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    /**
     * �����Ƿ��������ȡ���������
     * @param year
     * @return
     */
    public static long getMaxDaysFormYear(long year)
    {
    	return (isLoopYear(year)) ? 366 : 365;
    }
    
    /**
     * ͨ���·ݻ�ȡ��Ӧ������
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
     * ͨ�����ֻ�ȡ�·ݵ�Ӣ����
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
    * ���������ջ�ȡÿ�µ�һ�������ڼ�
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