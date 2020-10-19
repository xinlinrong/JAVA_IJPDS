/**
 * 练习 4.12 十六进制转二进制
 * @author integrate
 */
public class MyPratise412 extends AbstractPratiseImpl {	
	@Override
    public void run()
    {
		this.print("Enter a hex digit:");
    	String inputString = in.nextLine();
        if (inputString.length() > 1) {
        	this.print("%s is an invalid input", inputString);
        	System.exit(-1);
        }
        
        char inputChar = inputString.charAt(0);
        if (!(Character.isDigit(inputChar)) 
        && !(inputChar >= 'A' && inputChar <= 'F')
        && !(inputChar >= 'a' && inputChar <= 'f')) {
        	this.print("%s is an invalid input", inputString);
        	System.exit(-1);
        }

        int actualInteger = 0;
        if (Character.isDigit(inputChar)) {
        	actualInteger = inputChar - '0';
        } else {
        	actualInteger = inputChar - 'A' + 10;
        }
        this.print("The binary value is %s", Integer.toBinaryString(actualInteger));
    }
}
