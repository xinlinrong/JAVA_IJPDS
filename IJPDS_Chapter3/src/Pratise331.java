public class Pratise331 extends AbstractPratiseImpl{
    /**
     * ½ðÈÚ: »õ±Ò¶Ò»»
     */
	@Override
    public void run()
    {
    	print("Enter the exchange rate form dollars to RMB:");
    	double exchange = in.nextDouble();
        
    	print("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int status = in.nextInt();
        double dollarAmount = 0.0f;
        double rmbAmount = 0.0f;
        switch (status) {
            case 0:
            	print("Enter the dollars amount:");
            	dollarAmount = in.nextDouble();
                rmbAmount = dollarAmount * exchange;
                print("$%.1f is %.1f yuan", dollarAmount, rmbAmount);
                break;
            case 1:
            	print("Enter the RMB amount:");
            	rmbAmount = in.nextDouble();
                dollarAmount = rmbAmount / exchange;
                print("$%.1f is %.1f yuan", dollarAmount, rmbAmount);
                break;
            default:
            	print("Incorrect input");
        }
    }
}
