/**
 * 练习 4.8 给出 ASCII 码对应的字符
 * @author integrate
 */
public class MyPratise48 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		this.print("Enter a ASCII code:");
		int code = in.nextInt();
        char c = (char) code;
        this.print("The character for ASCII  %d is %c", code, c);
	}
}
