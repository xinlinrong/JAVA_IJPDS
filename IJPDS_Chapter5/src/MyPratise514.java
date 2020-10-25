/**
 * ��ϰ 5.14: �������Լ��
 * @author integrate
 */
public class MyPratise514 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	// ��ȡ��һ������
    	this.print("Enter first integer:");
    	int number1 = in.nextInt();
    	
    	// ��ȡ�ڶ�������
    	this.print("Enter Second integer:");
    	int number2 = in.nextInt();

        if (number1 <= 0 || number2 <=0) {
        	this.print("Error,  both number's value must be greater than 0");
        } else if (number1 == number2) {
        	this.print("Numbers must be different");
        }

        int gcdValue = 1;
        int minOfNumber = Math.min(number1, number2);
        for (gcdValue = minOfNumber; gcdValue > 0; gcdValue--) {
        	if (number1 % gcdValue == 0 && number2 % gcdValue == 0) {
        		break;
        	}
        }
        this.print("The greatest common divisor for %d and %d is %d", number1, number2, gcdValue);
    }       
}
