/**
 * 练习 4.19 商业.检测ISBN-10
 * @author integrate
 */
public class MyPratise419 extends AbstractPratiseImpl {

	/**
	 * 计算出最后一位 ISBN
	 * @param isbn
	 */
	private int calcLastIsbn(String isbn)
	{
		int total = 0;
		for (int i = 0; i < isbn.length(); ++ i) {
			total += (isbn.charAt(i) - '0') * (i + 1);
		}
		return (total % 11);
	}
	
	@Override
    public void run()
    {
		this.print("Enter the first 9 digits of an ISBN as integer:");
		String isbnOfFirstNine = in.next();
		if (isbnOfFirstNine.length() != 9) {
			this.print("Invalid input");
			System.exit(-1);
		} else {
			for (int i = 0; i < isbnOfFirstNine.length(); ++i) {
				if (!Character.isDigit(isbnOfFirstNine.charAt(i))) {
					this.print("Invalid input");
					System.exit(-1);
				}
			}
		}
		
		int lastIsbn = calcLastIsbn(isbnOfFirstNine);
		String newIsbn = isbnOfFirstNine +(lastIsbn == 10 ? "X" : lastIsbn);
        this.print("The ISBN-10 number is %s", newIsbn);
    }
}
