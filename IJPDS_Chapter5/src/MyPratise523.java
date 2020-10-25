/**
 * Á·Ï° 5.23: ÑÝÊ¾µÖÏû´íÎó
 * @author integrate
 */
public class MyPratise523 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		print("Enter number n:");
        int number = in.nextInt();
        double leftCalaResult = 0.0;
         for (int i = 1; i <= number; ++ i) {
        	 leftCalaResult += 1.0 / i;
         }
         print("Result from left to right is %.20f", leftCalaResult);
         
         double rightCalaResult = 0.0;
         for (int i = number; i >= 1; -- i) {
        	 rightCalaResult += 1.0 / i;
         }
         print("Result from right to left is %.20f", rightCalaResult);
         
    }
}
