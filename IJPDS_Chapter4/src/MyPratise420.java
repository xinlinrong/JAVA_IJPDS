/**
 * 练习 4.20 字符串处理
 * @author integrate
 */
public class MyPratise420 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		this.print("Please input a string:");
		String lineOfString = in.next();
        this.print("String \"%s\" lenght is %d, it's first letter is %c.", lineOfString, lineOfString.length(), lineOfString.charAt(0));
    }
}
