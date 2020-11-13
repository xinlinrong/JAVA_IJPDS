/**
 * 练习6.24: 显示当前日期和时间
 * @author integrate
 */
public class MyPractise624 extends AbstractPratiseImpl {

	@Override
    public void run()
    {
		CalendarUtils cu = new CalendarUtils();
        print("%d-%d-%d %d:%d:%d",
        		cu.getCurrentYear(), cu.getCurrentMonth(), cu.getCurrentDay(),
        		cu.getCurrentHours(), cu.getCurrrentMinutes(), cu.getCurrentSeconds());
    }
}
