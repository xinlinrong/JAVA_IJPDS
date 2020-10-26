/**
 * 练习 5.39: 最大数的出现次数
 * @author integrate
 */
public class MyPratise541 extends AbstractPratiseImpl {

	@Override
	public void run()
	{
		int number = 0, maxNumber=0, maxTimes = 0;
		print("Enter numbers:");
		while (true) {
			number = in.nextInt();
            if (number == 0) {
            	break;
            }

            if (maxNumber < number) {
            	maxNumber = number;
                maxTimes = 0;
            } else {
                ++ maxTimes;
            }
		}

	   print("The largest number is %d", maxNumber);
	   print("The occurrence count of largest is %d", maxTimes);
	}
}
