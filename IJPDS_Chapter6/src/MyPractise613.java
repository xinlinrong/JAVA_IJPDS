/**
 * 练习6.13: 数列求和
 * @author integrate
 */
public class MyPractise613 extends AbstractPratiseImpl {

	public double comupteSerial(int n)
	{
		double total = 0.0;
		for (int i = 1; i <= n; ++i) {
			int divisor = i + 1;
            total += (i * 1.0) / divisor;
		}
		return total;
	}
	
	@Override
	public void run()
	{
		print("Enter the number:");
		int number = in.nextInt();
        if (number <= 0) {
        	print("Number must be greater than 1");
        	return;
        }

        print("%-43s%-41s", "销售总额", "m(i)");
        print("_______________________");
        for (int i = 1; i <= number; ++i) {
	    	double sum = comupteSerial(i);
        	print("%-15d%.4f", i, sum);
	    }
	}
}
