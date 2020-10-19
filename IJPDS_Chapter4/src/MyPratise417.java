/**
 * 练习 4.16 一个月的天数
 * @author integrate
 */
public class MyPratise417 extends AbstractPratiseImpl {

	/**
	 * 根据月份英文转换成数字
	 * @param monthStr
	 * @return
	 */
	private int monthStr2Digit(String monthStr)
	{
		int month = -1;
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i = 0; i < months.length; ++ i) {
        	if (months[i].equals(monthStr)) {
        		month = i + 1;
        	}
        }
        return month;
	}

	/**
	 * 计算月份又多少天
	 * @param year
	 * @param month
	 * @return
	 */
	public int getDays(int year, int month)
	{
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		}

		if (month == 2) {
			if (year % 4 == 0 && year %100 != 0) {
				days += 1; 
			} else if (year % 4 == 0 && year %400 == 0) {
				days += 1; 
			}
		}
		return days;
	}
	
	@Override
    public void run()
    {
		// 获取年
		this.print("Enter a year:");
		int year = in.nextInt();

        // 获取月份
		this.print("Enter a month:");
		String monthStr = in.next();
		int month = monthStr2Digit(monthStr);
        if ((month = monthStr2Digit(monthStr)) == -1) {
        	 this.print("%s is not a corrent month name", monthStr);
        	 System.exit(-1);
         }
        int days = getDays(year, month);
        this.print("%s %d has %d days", monthStr, year, days);
    }
}
