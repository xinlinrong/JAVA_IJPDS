/**
 * ��ϰ 5.32: ��Ϸ.��Ʊ
 * @author integrate
 */
public class MyPratise532 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		int number2 = -1;
		int number1 = (int) (Math.random() * 10);
		do {
			number2 = (int) (Math.random() * 10);
		} while (number1 == number2);

	    print("The output number is %d%d", number1, number2);
	}
}
