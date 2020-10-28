/**
 * ¡∑œ∞ 5.47: …Ã“µ:ºÏ≤‚ISBN-13
 * @author integrate
 */
public class MyPratise547 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter the first 12 digits of an ISBN-13 as a string:");
		String isbnOf12Digits = in.next();

		if (isbnOf12Digits.length() != 12) {
			print("%s is an invalid input", isbnOf12Digits);
			System.exit(-1);
		}

		for (int i = 0; i < isbnOf12Digits.length(); ++i) {
			if (isbnOf12Digits.charAt(i) <= '0' || isbnOf12Digits.charAt(i) >= '9') {
				print("%s is an invalid input", isbnOf12Digits);
				System.exit(-1);
			}
		}
		
		int sum = 0;
		for (int i = 0; i < isbnOf12Digits.length(); ++i) {
			if (i % 2 == 0) {
				sum += (isbnOf12Digits.charAt(i) - '0');
			} else {
				sum +=  3 * (isbnOf12Digits.charAt(i) - '0');
			}
		}

		String completeIsbn = isbnOf12Digits;
	    int lastDigit = 10 - (sum % 10);
	    lastDigit = (lastDigit == 10) ? 0 : lastDigit;
	    completeIsbn += String.valueOf(lastDigit);
	    
	    print("The ISBN-13 number is %s", completeIsbn);
	}
}
