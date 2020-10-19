/**
 * 练习 4.21 检测SSN
 * @author integrate
 */
public class MyPratise421 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		this.print("Enter a SSN:");

		boolean isValid = true;
		String ssn = in.next();
        for (int i = 0; i < ssn.length(); ++ i) {
        	if (i == 3 || i == 6) {
        		if (ssn.charAt(i) != '-') {
        			isValid = false;
        			break;
        		}
        	} else {
        		if (!Character.isDigit(ssn.charAt(i))) {
        			isValid = false;
        			break;
        		}
        	}
        }

        this.print("%s is an %s social security number", ssn, (isValid ? "valid" : "invalid"));
    }
}
