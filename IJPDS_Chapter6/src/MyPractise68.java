/**
 * ��ϰ6.8: ���϶��뻪�϶ȵ�ת��
 * @author integrate
 */
public class MyPractise68 extends AbstractPratiseImpl {	
	@Override
    public void run()
    {
		// �������϶��Լ����϶ȵĳ�ʼֵ
		double beginCelsius = 40.0, celsiusDecrement = 1.0;
		double beginFahrenheit = 120.0, fahrenheitDecrement = 10.0;

        print("%-43s%-43s%-43s%-43s", "���϶�", "���϶�", "���϶�", "���϶�");
        print("_____________________________________________________");
        for (int i = 0; i <= 9; ++ i) {
        	double printCelsius = beginCelsius - celsiusDecrement * i;
        	double calcFahrenheit = TemperatureConverter.celsiusToFahrenheit(printCelsius);

        	double printFahrenheit = beginFahrenheit - fahrenheitDecrement * i;
        	double calcCelsius = TemperatureConverter.fahrenheitToCelsius(printFahrenheit);
        	
        	print("%-15.1f%-15.1f%-15.1f%-15.2f", printCelsius, calcFahrenheit, printFahrenheit, calcCelsius);
		}
    }
}