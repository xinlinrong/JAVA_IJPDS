/**
 * ¡∑œ∞6.34: ¥Ú”°»’¿˙
 * @author integrate
 */
public class MyPractise634 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
        print("Enter full year (.e.g 2012):");
        int year = in.nextInt();
        print("Enter month as number between 1 - 12:");
        int month = in.nextInt();

        print("%12s %d", CalendarUtils.getMonthShortStr(month), year);
        print("____________________________");
        print(" Sun Mon Tue Wed Thu Fri Sat");

        int columnCounts = 0;
        int weekDay = CalendarUtils.getWeekDayFormDay(year, month, 1);
        int maxDaysOfMonth = (int) CalendarUtils.getMaxMonthDays(year, month);
        for (int i = 1; i < (maxDaysOfMonth + weekDay); ++ i) {
            if (i < weekDay) {
        		System.out.printf("%4s", "");
        	} else {
        		if (i % 7 == 0) {
            		System.out.printf("%4d\n", i - weekDay + 1);
        		} else {
            		System.out.printf("%4d", i - weekDay + 1);
        		}
        	}
        }
    }
}
