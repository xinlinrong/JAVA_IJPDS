import java.util.Scanner;

public class AbstractPratiseImpl implements IPratiseInterface {

	/**
	 * 初始化输入的类
	 */
	protected Scanner in = new Scanner(System.in);
	
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
	 * 执行打印带有参数的消息接口
	 */
    public void print(String foramt, Object ...args)
    {
    	System.out.printf(foramt, args);
    	System.out.println("");
    }
}
