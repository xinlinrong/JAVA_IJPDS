public class Pratise327 extends AbstractPratiseImpl {
    /**
     * ����: ���Ƿ�����������
     */
	@Override
    public void run()
    {
		double k = -0.5, b = 100f; // ֱ�ߵ�б���Լ�����
        print("Enter a point's x- and y-coordinates:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        if (x1 < 0 || x1 >= 200) { // x ������Χ
        	print("The point is not in the triangle.");
        } else if ((k * x1 + b) < y1) { // ʵ�ʼ���� y ֵС�� ��ʵ�� y1 ֵ
        	print("The point is not in the triangle.");
        } else {
        	print("The point is in the triangle.");
        }
    }
}
