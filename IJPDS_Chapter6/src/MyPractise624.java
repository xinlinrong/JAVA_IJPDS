/**
 * ��ϰ6.24: ��ʾ��ǰ���ں�ʱ��
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
