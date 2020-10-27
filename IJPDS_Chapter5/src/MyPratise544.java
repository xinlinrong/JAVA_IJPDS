/**
 * 练习 5.43: 计算机体系结构, 比特级的操作
 * @author integrate
 */
public class MyPratise544 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter an integer:");
		short sval = in.nextShort();
        print("The bits are:");
        for (int i = 15; i >= 0; --i) {
        	int temp = sval >> i;
        	int bit = temp & 1;
        	System.out.print(bit);
        }
	}
}
