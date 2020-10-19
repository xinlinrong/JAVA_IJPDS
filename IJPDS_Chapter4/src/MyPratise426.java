/**
 * 练习 4.26 金融应用: 货币单位
 * @author integrate
 */
public class MyPratise426 extends AbstractPratiseImpl  {
	@Override
    public void run()
    {
		this.print("Enter an amount in doube, for example, 11.56:");
		String amountInStr = in.nextLine();
        int dotPosition = amountInStr.indexOf('.');
        String numberBeforeDot = (dotPosition == -1) ? amountInStr : amountInStr.substring(0, dotPosition);
        String numberAfterDot = (dotPosition == -1) ? "0" : amountInStr.substring(dotPosition+1);
        
        int numberOfOneDollor = Integer.parseInt(numberBeforeDot);
        int remainPennies = Integer.parseInt(numberAfterDot);

        int numberOfQuarters = 0;
        int numberOfDimes = 0;
        int numberOfNickles = 0;
        int numberOfPennies = 0;

        numberOfQuarters = remainPennies / 25;
        remainPennies = remainPennies - numberOfQuarters * 25;

        numberOfDimes = remainPennies / 10;
        remainPennies = remainPennies - numberOfDimes * 10;

        numberOfNickles = remainPennies / 5;
        remainPennies = remainPennies - numberOfNickles * 5;

        numberOfPennies = remainPennies;

        this.print("Your amount consists of");
        this.print("%d dollors", numberOfOneDollor);
        this.print("%d quarters", numberOfQuarters);
        this.print("%d dimes", numberOfDimes);
        this.print("%d nickles", numberOfNickles);
        this.print("%d pennies", numberOfPennies);
    }
}
