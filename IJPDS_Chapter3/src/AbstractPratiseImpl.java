import java.util.Scanner;

public class AbstractPratiseImpl implements IPratiseInterface {

	/**
	 * ��ʼ���������
	 */
	protected Scanner in = new Scanner(System.in);
	
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
	 * ִ�д�ӡ���в�������Ϣ�ӿ�
	 */
    public void print(String foramt, Object ...args)
    {
    	System.out.printf(foramt, args);
    	System.out.println("");
    }
}
