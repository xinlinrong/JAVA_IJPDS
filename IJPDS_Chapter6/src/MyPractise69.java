
public class MyPractise69 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		double beginFootVal = 1.0, footIncrement = 1.0;
		double beginMeterVal = 20.0, meterIncrement = 5.0;

        print("%-43s%-43s%-43s%-43s", "Ó¢³ß", "Ã×", "Ã×", "Ó¢³ß");
        print("_____________________________________________________");
        for (int i = 0; i < 10; ++ i) {
        	double printFootVal = beginFootVal + i * footIncrement;
        	double calcMeterVal = MetreFeetConverter.footToMeter(printFootVal);

            double printMeterVal = beginMeterVal + i * meterIncrement;
            double calcFootVal = MetreFeetConverter.meterToFeet(printMeterVal);

        	print("%-15.1f%-15.3f%-15.1f%-15.3f", printFootVal, calcMeterVal, printMeterVal, calcFootVal);
        }
	}
}
