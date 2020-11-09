/**
 * Á·Ï° 6.18: ¼ì²âÃÜÂë
 * @author integrate
 */
public class MyPractise618 extends AbstractPratiseImpl {
	/**
	 * ¼ì²âÃÜÂë
	 * @param password
	 * @return
	 */
	public static boolean validatePassword(String password)
	{
		if (password.length() < 8) {
			return false;
		}

	    int numberCounts = 0;
        for (int i = 0; i < password.length(); ++ i) {
        	if (!Character.isLetter(password.charAt(i))
        	&& !Character.isDigit(password.charAt(i))) {
        		return false;
        	}

            if (Character.isDigit(password.charAt(i))) {
            	numberCounts++;
            }
        }

	    if (numberCounts < 2) {
	    	return false;
	    }
	    
	    return true;
	}

    @Override
    public void run()
    {
    	print("Enter password:");
    	String password = in.nextLine();
        if (validatePassword(password)) {
        	print("Valid password");
        } else {
        	print("Invalid password");
        }
    }
}
