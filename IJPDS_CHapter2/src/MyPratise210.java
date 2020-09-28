import java.util.Scanner;

public class MyPratise210 implements IPratise {

	protected final double FACTOR = 4184;
	
	public void run()
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms:");
        double kilogram = in.nextDouble();
        System.out.print("Enter the initial temperature:");
        double initialTemp = in.nextDouble();
        System.out.print("Enter the final temperature:");
        double finalTemp = in.nextDouble();
        double energy = kilogram * (finalTemp - initialTemp) * FACTOR;
        System.out.printf("The energy need is %.1f", energy);
        in.close();
    }
}
