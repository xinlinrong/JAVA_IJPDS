/**
 * 练习 4.15 电话键盘
 * @author integrate
 */
public class MyPratise415 extends AbstractPratiseImpl {

	public int getTelNumberByLetter(char letter)
	{
		int number = 2;
		char newLetter = Character.toLowerCase(letter);

		switch (newLetter) {
		case 'a':
		case 'b':
		case 'c':
			number = 2;
			break;
		case 'd':
		case 'e':
		case 'f':
			number = 3;
			break;
		case 'g':
		case 'h':
		case 'i':
			number = 4;
			break;
		case 'j':
		case 'k':
		case 'l':
			number = 5;
			break;
		case 'm':
		case 'n':
		case 'o':
			number = 6;
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			number = 7;
			break;
		case 't':
		case 'u':
		case 'v':
			number = 8;
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			number = 9;
			break;
		}

		return number;
	}
	
	@Override
    public void run()
    {
		this.print("Enter a Letter:");
    	String inputString = in.nextLine();
        if (inputString.length() > 1) {
        	this.print("T is an invalid input");
        	System.exit(-1);
        }
        
        char inputChar = inputString.charAt(0);
        if (!Character.isLetter(inputChar)) {
        	this.print("%c is an invalid input", inputChar);
        	System.exit(-1);
        }
        
        int number = getTelNumberByLetter(inputChar);
        this.print("The corresponding number is %d", number);
    }
}
