import java.util.Scanner;

public class MyPratise25 implements IPratise {
    
	/**
     * 金融应用: 计算小费
     */
	public void run()
    {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter a subtotal and a gratuity rate:");
	    double subtotal = in.nextDouble();
	    double gratuityRate = in.nextDouble();
	    double gratuity = subtotal * gratuityRate / 100.0;
        System.out.printf("The gratuity is %.1f and total is %.1f", gratuity, (subtotal + gratuity));
        in.close();
        return;
    }
}
