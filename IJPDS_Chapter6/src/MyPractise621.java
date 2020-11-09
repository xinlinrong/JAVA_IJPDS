/**
 * 练习6.21: 电话按键盘
 * @author integrate
 */
public class MyPractise621 extends AbstractPratiseImpl {

	/**
     * 根据字母获取数字
     * @param uppercaseLetter
     * @return
     */
	public static int getNumber(char uppercaseLetter)
	{
		int number = 2;
		switch (uppercaseLetter) {
			case 'A':
			case 'B':
			case 'C':
				number = 2;
				break;
			case 'D':
			case 'E':
			case 'F':
				number = 3;
				break;
			case 'G':
			case 'H':
			case 'I':
				number = 4;
				break;
			case 'J':
			case 'K':
			case 'L':
				number = 5;
				break;
			case 'M':
			case 'N':
			case 'O':
				number = 6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				number = 7;
				break;
			case 'T':
			case 'U':
			case 'V':
				number = 8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				number = 9;
				break;
		}
		return number;
	}

	@Override
    public void run()
    {
    	print("Enter a string:");
    	String s = in.nextLine();
    	String newStr = "";
        for (int i = 0; i < s.length(); ++ i) {
        	if (Character.isLetter(s.charAt(i))) {
        		newStr += getNumber(Character.toUpperCase(s.charAt(i)));
        	} else {
        		newStr += s.charAt(i);
        	}
        }
        print(newStr);
    }
}
