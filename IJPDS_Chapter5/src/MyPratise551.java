/**
 * 练习 5.51: 最长的共同前缀
 * @author integrate
 */
public class MyPratise551 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter the first string:");
		String firstStr = in.nextLine();

		print("Enter the last string:");
		String secondStr = in.nextLine();

		String prefix = "";
	    String shortStr = (firstStr.length() >= secondStr.length()) ? secondStr : firstStr;
	    String longStr = (firstStr.length() >= secondStr.length()) ? firstStr : secondStr;
	    for (int i = 0; i < shortStr.length(); ++ i) {
        	if (shortStr.charAt(i) == longStr.charAt(i)) {
        		prefix = prefix.concat(Character.toString(shortStr.charAt(i)));
        	} else {
        		 break;
        	}
        }

	    if (prefix.length()>0) {
	    	print("The common prefix is %s", prefix);
	    } else {
	    	print("%s and %s hava no common prefix", firstStr, secondStr);
	    }
	}
}
