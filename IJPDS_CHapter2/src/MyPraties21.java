import java.util.Scanner;

public class MyPraties21 implements IPratise {

	/**
	 * ���������¶�ת���ɻ����¶�
	 */
	public void run()
    {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a degree in Celsius:");
         double degreeInCelsius = in.nextDouble();
         double degreeInFarenheit = degreeInCelsius * 9.0 / 5 + 32.0;
         System.out.printf("%.2f Celsius is %.2f Farenheit", degreeInCelsius, degreeInFarenheit);
         in.close();
         return;
    }
}
