/**
 * ������������
 * @author integrate
 *
 */
public class Pratise316 extends AbstractPratiseImpl {

	/**
	 * ���ɾ��������
	 * @param maxNumber
	 * @return double
	 */
	private double generateRectanglePoint(double  maxNumber)
	{
        return Math.pow(-1 , (int)(Math.random() * 1000)) * Math.random() *  maxNumber;
	}
	
	/**
	 * �漴��
	 */
	@Override
    public void run()
    {
    	double pointX = generateRectanglePoint(100.0f/2);
    	double pointY = generateRectanglePoint(200.0f/2);
        print("random point is (%f, %f)", pointX, pointY);
    }
}
