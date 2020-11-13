/**
 * 练习6.33: 当前日期和时间
 * @author integrate
 */
public class MyPractise633 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		CalendarUtils cu = new CalendarUtils();
        print("Current date and time is %s %d, %d %d:%d:%d",
        		CalendarUtils.getMonthShortStr((int)cu.getCurrentMonth()), cu.getCurrentDay(), cu.getCurrentYear(),
        		cu.getCurrentHours(), cu.getCurrrentMinutes(), cu.getCurrentSeconds());
    }
}
