/**
 * 练习 5.35: 商业应用: 检测ISBN
 * @author integrate
 */
public class MyPratise536 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
        print("Enter th first 9 digits of an ISBN as integer:");
        int isbnDigit = in.nextInt();

        int verifyResult = 0, operatorDigit = isbnDigit;
        for (int i = 9; i >= 1; -- i) {
        	verifyResult += i * (operatorDigit % 10);
        	operatorDigit /= 10;
        }

        if ((verifyResult % 11) == 10) {
        	this.print("The ISBN-10 number is %dX", isbnDigit);
        } else {
        	this.print("The ISBN-10 number is %d%d", isbnDigit, (verifyResult % 11));
        }
	}
}
