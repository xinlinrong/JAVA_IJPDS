/**
 * 练习 4.13 判断元音还是辅音
 * @author integrate
 */
public class MyPratise413 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		this.print("Enter a Letter:");
    	String inputString = in.nextLine();
        if (inputString.length() > 1) {
        	this.print("%s is an invalid input", inputString);
        	System.exit(-1);
        }
        
        char inputChar = inputString.charAt(0);
        if (!Character.isLetter(inputChar)) {
        	this.print("%s is an invalid input", inputString);
        	System.exit(-1);
        }

        String vowelStr = "AEIOUaeiou";
        if (vowelStr.indexOf(inputChar) != -1) {
        	this.print("%c is a vowel", inputChar);
        } else {
        	this.print("%c is a consonant", inputChar);
        }
    }
}
