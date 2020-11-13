/**
 * 练习6.25: 将毫秒转化为小时数, 分钟数, 秒数
 * @author integrate
 */
public class MyPractise625 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		CalendarUtils cu = new CalendarUtils(555550000);
        print("%d:%d:%d",(cu.getMilliSeconds() / 3600000), cu.getCurrrentMinutes(), cu.getCurrentSeconds());
    }
}
