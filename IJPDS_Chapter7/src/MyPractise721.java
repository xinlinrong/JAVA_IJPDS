/**
 * 练习 7.21: 整数求和
 */
public class MyPractise721 extends AbstractPratiseImpl {

	private String[] args;

	MyPractise721()
	{
	}
	
	MyPractise721(String[] args)
	{
		this.args = args;
	}
	
	@Override
	public void run()
	{
		int sum = 0;
		if (this.args.length > 1) {
			for (int i = 0; i < this.args.length; ++ i) {
				sum += Integer.parseInt(this.args[i]);
			}
		}
		printFormatLine("Result is %d", sum);
	}
}
