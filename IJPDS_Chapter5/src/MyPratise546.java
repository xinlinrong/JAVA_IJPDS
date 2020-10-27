/**
 * Á·Ï° 5.46: µ¹ÅÅÒ»¸ö×Ö·û´®
 * @author integrate
 */
public class MyPratise546 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter a string:");
		String inputStr = in.next();
		String outStr = "";
        int strLen = inputStr.length();
        for (int i = strLen - 1; i >= 0; -- i) {
        	outStr += inputStr.charAt(i);
        }
        print("The reversed strin is %s", outStr);
	}
}
