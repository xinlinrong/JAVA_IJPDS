/**
 * 练习6.8: 摄氏度与华氏度的转换
 * @author integrate
 */
public class MyPractise68 extends AbstractPratiseImpl {	
	@Override
    public void run()
    {
		// 定义摄氏度以及华氏度的初始值
		double beginCelsius = 40.0, celsiusDecrement = 1.0;
		double beginFahrenheit = 120.0, fahrenheitDecrement = 10.0;

        print("%-43s%-43s%-43s%-43s", "摄氏度", "华氏度", "华氏度", "摄氏度");
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