import java.util.Scanner;

public class MyPratise223 implements IPratise {
    /**
     * ��ʻ����
     */
	public void run()
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter the driving distance:");
    	double distance = in.nextDouble();
    	System.out.print("Enter miles per gallon:");
    	double milesPerGallon = in.nextDouble();
    	System.out.print("Enter price per gallon:");
    	double pricePerGallon = in.nextDouble();
    	double cost = distance / milesPerGallon * pricePerGallon;
        System.out.printf("The cost of driving is $%.2f", cost);
        in.close();
    }
}
