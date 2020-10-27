/**
 * 练习 5.45: 统计:计算平均值与基本方差
 * @author integrate
 */
public class MyPratise545 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter 10 numbers:");

		double total =0.0, mean=0.0, inputVal = 0.0;
		double sumSd = 0.0, sdVal = 0.0;
		for (int i = 0; i < 10; ++i) {
			inputVal = in.nextDouble();
			total += inputVal; // 自添加值
			sumSd += Math.pow(inputVal, 2);
		}

		mean = total / 10;
		print("The mean is %.2f", mean);

		sdVal = sumSd - (Math.pow(total, 2) / 10);
		sdVal = sdVal / (10 - 1);
		sdVal = Math.sqrt(sdVal);

	    print("The standard deviation is %.6f", sdVal);
	}
}
