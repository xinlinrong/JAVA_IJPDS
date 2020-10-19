/**
 * 练习 4.11 十进制转十六进制
 * @author integrate
 *
 */
public class MyPratise411  extends AbstractPratiseImpl {

	/**
	 * 十进制转换成十六进制
	 * @param number
	 * @return
	 */
	public char Dec2Hex(int number)
	{
		char c = '0';
		switch (number) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				c = (char)('0' + number);
				break;
			case 10:
				c = 'A';
				break;
			case 11:
				c = 'B';
				break;
			case 12:
				c = 'C';
				break;
			case 13:
				c = 'D';
				break;
			case 14:
				c = 'E';
				break;
			case 15:
				c = 'F';
				break;
		}
		return c;
	}
	
	@Override
	public void run()
	{
		this.print("Enter a decimal value (0 to 15):");
		int number = in.nextInt();
        if (number < 0 || number > 15) {
        	this.print("%d is an invalid input");
        } else {
    		char c = Dec2Hex(number);
    		this.print("The hex value is %c", c);
        }
	}
}
