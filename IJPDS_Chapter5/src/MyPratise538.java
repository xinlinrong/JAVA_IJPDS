/**
 * 练习 5.38: 十进制转换为八进制
 * @author integrate
 */
public class MyPratise538 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter a digit:");
        int number = in.nextInt();
        int divisor = 8, mod = 0, operatorNum = number;

        String OctStr = "";
        do {
        	mod = operatorNum % divisor;
        	operatorNum = operatorNum / divisor;
        	OctStr = String.valueOf(mod) + OctStr;
        } while(operatorNum/divisor > 0);
        OctStr = String.valueOf(operatorNum) + OctStr;
        
        print("Output binary String is %s", OctStr);
	}
}
