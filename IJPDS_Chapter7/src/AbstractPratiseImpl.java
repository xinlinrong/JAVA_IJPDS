import java.util.Scanner;

public class AbstractPratiseImpl implements IPratiseInterface {

	/**
	 * ��ʼ���������
	 */
	protected Scanner in = null;
	
	public AbstractPratiseImpl()
	{
		in = new Scanner(System.in);
	}
	
	/**
	 * ʵ��ִ�нӿ�, ִ�����й���
	 */
	public void run()
    {
    }

	/**
	 * ִ�д�ӡ��Ϣ�ӿ�
	 */
	public void print(String message)
	{
    	System.out.println(message);
	}
	
	/**
	 * ִ�д�ӡ��Ϣ�ӿ�
	 */
	public void printLine(String message)
	{
		print(message + "\n");
	}

	/**
	 * ִ�д�ӡ���в�������Ϣ�ӿ�
	 */
    public void printFormat(String format, Object ...args)
    {
    	System.out.printf(format, args);
    }
	
	/**
	 * ִ�д�ӡ���в�������Ϣ�ӿ�
	 */
    public void printFormatLine(String format, Object ...args)
    {
    	printFormat(format + "\n", args);
    }
}
