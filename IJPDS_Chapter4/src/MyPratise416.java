/**
 * 练习 4.16 随机字符
 * @author integrate
 */
public class MyPratise416  extends AbstractPratiseImpl  {
	@Override
    public void run()
    {
		double randomReal = Math.random();
		int randomChar = 'A' + (int)(26 * randomReal);
		this.print("Random Character is %c", randomChar);
    }
}
