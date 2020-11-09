/**
 * ¡∑œ∞6.14: π¿À„ pi
 * @author integrate
 */
public class MyPractise614 extends AbstractPratiseImpl {

	public double comupteMathPi(int n)
	{
		double quraterTotal = 0.0;
		for (int i = 1; i <= n; ++i) {
			quraterTotal += Math.pow(-1, i - 1) / (2 * i -1);
		}
		return 4.0 * quraterTotal;
	}
	
	@Override
	public void run()
	{
		print("Enter the number:");
		int number = in.nextInt();
        if (number < 0) {
        	print("Number must be greater than 0");
        	return;
        }

        print("%-43s%-41s", "œ˙ €◊‹∂Ó", "m(i)");
        print("_______________________");
        for (int i = 0; i <= number; ++i) {
        	double sum = comupteMathPi(i *100 + 1);
        	print("%-15d%.4f", i *100 + 1, sum);
	    }
	}
}
