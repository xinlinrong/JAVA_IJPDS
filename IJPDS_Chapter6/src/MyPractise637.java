/**
 * ��ϰ6.37: ��ʽ������
 * @author integrate
 */
public class MyPractise637 extends AbstractPratiseImpl {

	/**
	 * ��ʽ��
	 * @param number
	 * @param width
	 * @return
	 */
	public static String format(int number, int width)
    {
    	String formatStr = "";
    	int numberLen = Integer.toString(number).length(); 
        if (numberLen > width) {
        	formatStr = Integer.toString(number);
        } else {
        	StringBuilder sb = new StringBuilder();
        	for (int i = 0; i < width - numberLen; ++ i) {
        		sb.append('0');
        	}
        	sb.append(Integer.toString(number));
        	formatStr = sb.toString();
        }
        return formatStr;
    }
	
	@Override
    public void run()
    {
		print("Enter the number:");
		int number = in.nextInt();
		print("Enter the format width:");
		int width = in.nextInt();

		print("The format string of %d is %s", number, format(number, width));
    }
}
