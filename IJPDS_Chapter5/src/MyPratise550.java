/**
 * ��ϰ 5.50: �Դ�д��ĸ���м���
 * @author integrate
 */
public class MyPratise550 extends AbstractPratiseImpl {	
	@Override
	public void run()
	{
		print("Enter a string:");
		String testStr = in.nextLine();
        int upperCaseNum = 0;
        for (int i = 0; i < testStr.length(); ++ i) {
            if (Character.isUpperCase(testStr.charAt(i))) {
            	upperCaseNum++;
            }
        }
        print("The number of uppercase letters  is %d", upperCaseNum);
	}
}