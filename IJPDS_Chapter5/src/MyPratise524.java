/**
 * 练习 5.24: 数列求和
 * @author integrate
 */
public class MyPratise524 extends AbstractPratiseImpl{
	@Override
    public void run()
    {
		print("Enter the number n:");
		int number = in.nextInt();
		double result = 0.0f;
        for (int i = number; i >= 1; -- i) {
        	result += (2 * i - 1) * 1.0 / (2 * i + 1);
        }
		print("Final result is %f.", result);
    }
}
