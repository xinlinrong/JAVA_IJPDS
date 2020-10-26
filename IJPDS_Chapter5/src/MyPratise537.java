/**
 * 练习 5.37: 十进制转换为二进制
 * @author integrate
 */
public class MyPratise537 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter a digit:");
        int number = in.nextInt();
        int divisor = 2, mod = 0, operatorNum = number;

        String bainaryStr = "";
        do {
        	mod = operatorNum % divisor;
        	operatorNum = operatorNum / divisor;
        	bainaryStr = String.valueOf(mod) + bainaryStr;
        } while(operatorNum/divisor > 0);
        bainaryStr = String.valueOf(operatorNum) + bainaryStr;
        
        print("Output binary String is %s", bainaryStr);
	}
}
