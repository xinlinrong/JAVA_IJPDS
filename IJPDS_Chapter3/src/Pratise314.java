/**
 * ²ÂÓ²±ÒÕý·´Ãæ
 * @author integrate
 *
 */
public class Pratise314 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	int coinDigit = ((int) (Math.random() * 100)) % 2;
        print("Enter a digt (0, 1) for coin:");
        int guessDigit = in.nextInt();
        if (guessDigit == coinDigit) {
        	print("My coin digit is %d, your digit is match", coinDigit);
        } else {
        	print("My coin digit is %d, your digit is not match", coinDigit);
        }
    }
}
