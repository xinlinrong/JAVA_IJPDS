public class Pratise321 extends AbstractPratiseImpl {

	/**
	 * 获取当前是周几
	 * @param int dayOfWeek
	 * @return String
	 */
	private String getDayOfWeek(int dayOfWeek)
	{
		String dayStr = "";
		switch (dayOfWeek) {
		    case 2:  dayStr = "Monday"; break;
		    case 3: dayStr = "Thuesday"; break;
		    case 4: dayStr = "Wednesday"; break;
		    case 5: dayStr = "Thursday"; break;
		    case 6: dayStr = "Friday"; break;
		    case 0: dayStr = "Sutarday"; break;
		    case 1: dayStr = "Sunday"; break;
		}
		return dayStr;
	}
	
	@Override
    public void run()
    {
    	print("Enter the year: (e.g., 2012):");
    	int year = in.nextInt();

        print("Enter the month: 1-12: ");
        int month = in.nextInt();

        print("Enter the day of the month: 1-31: ");
        int day = in.nextInt();

        // 转换 year 以及 month
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
        print("Day of the week is %s", getDayOfWeek((int) dayOfWeek));
    }
}
