/**
 * 练习 4.9 给出字符的 Unicode 码
 * @author integrate
 */
public class MyPratise49  extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		this.print("Enter a character:");
	    String line = in.nextLine();
	    int unicode = (int)line.charAt(0);
       this.print("The Unicode for character %c is %d", line.charAt(0), unicode);
	}
}
