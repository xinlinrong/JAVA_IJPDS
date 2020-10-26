/**
 * ��ϰ 5.29: ����Ӧ��. ����CD��ֵ
 * @author integrate
 */
public class MyPratise531 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		// �����ʼ�Լ�ÿ�´������
		print("Enter the initial deposit amount:");
        double depositAmt = in.nextDouble();
        
        // ��������
        print("Enter annual percentage yield:");
        double annual = in.nextDouble();

        // ������������
        print("Enter maturity period (number of months):");
        int months = in.nextInt();

        double ratePerMonth = annual / 1200.0;
        print("%-10s%-10s", "Month", "CD Value");
        for (int i = 1; i <= months; ++ i) {
        	depositAmt = (depositAmt) * (1.0 + ratePerMonth);
            print("%-10d%-10.2f", i, depositAmt);
        }
	}
}
