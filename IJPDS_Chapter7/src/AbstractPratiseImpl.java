import java.util.Scanner;

public class AbstractPratiseImpl implements IPratiseInterface {

	/**
	 * 初始化输入的类
	 */
	protected Scanner in = null;
	
	public AbstractPratiseImpl()
	{
		in = new Scanner(System.in);
	}
	
	/**
	 * 实现执行接口, 执行运行功能
	 */
	public void run()
    {
    }

	/**
	 * 执行打印消息接口
	 */
	public void print(String message)
	{
    	System.out.println(message);
	}
	
	/**
	 * 执行打印消息接口
	 */
	public void printLine(String message)
	{
		print(message + "\n");
	}

	/**
	 * 执行打印带有参数的消息接口
	 */
    public void printFormat(String format, Object ...args)
    {
    	System.out.printf(format, args);
    }
	
	/**
	 * 执行打印带有参数的消息接口
	 */
    public void printFormatLine(String format, Object ...args)
    {
    	printFormat(format + "\n", args);
    }
}
