public class TemperatureConverter {
	/*
	 * 将摄氏度转换为华氏度
	 */
	public static double celsiusToFahrenheit(double celsius) {
		return ((9.0 / 5) * celsius + 32);
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return ((5.0 / 9) * (fahrenheit - 32));
	}
}