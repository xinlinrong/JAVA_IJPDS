/**
 * ��ϰ 5.43: �������ϵ�ṹ, ���ؼ��Ĳ���
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
