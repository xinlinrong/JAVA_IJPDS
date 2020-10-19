/**
 * 练习 4.14 转换字母等级为数字
 * @author integrate
 */
public class MyPratise414 extends AbstractPratiseImpl {
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
        if (!Character.isLetter(inputChar) || (inputChar < 'A' || inputChar > 'F')) {
        	this.print("T is an invalid input");
        	System.exit(-1);
        }

        int grade = 0;
        switch (inputChar) {
        case 'A':
        	grade = 4;
        	break;
        case 'B':
        	grade = 3;
        	break;
        case 'C':
        	grade = 2;
        	break;
        case 'D':
        	grade = 1;
        	break;
        default:
        	grade = 0;
        }

        this.print("The numeric value for grade %c is %d", inputChar, grade);
    }
}
