/**
 * ��ϰ 5.49: ��Ԫ���Լ��������м���
 * @author integrate
 */
public class MyPratise549 extends AbstractPratiseImpl {

	/**
	 * Ԫ���������Է���
	 * @param s
	 * @return
	 */
	public boolean testVowels(char s)
	{
		char lowerCaseChar = Character.toLowerCase(s);
		if (lowerCaseChar == 'a' || lowerCaseChar == 'e' ||lowerCaseChar == 'i'
		|| lowerCaseChar == 'o' || lowerCaseChar == 'u' ) {
			return true;
		}
		return false;
	}
	
	@Override
	public void run()
	{
		print("Enter a string:");
		String testStr = in.nextLine();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < testStr.length(); ++ i) {
            if (Character.isLetter(testStr.charAt(i))) {
	        	if (testVowels(testStr.charAt(i))) {
	        		vowels++;
	        	} else {
	        		consonants ++;
	        	}
            }
        }
        print("The number of vowels is %d", vowels);
        print("The number of consonants is %d", consonants);
	}
}
