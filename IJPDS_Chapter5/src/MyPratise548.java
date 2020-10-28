/**
 * Á·Ï° 5.48: ´¦Àí×Ö·û´®
 * @author integrate
 */
public class MyPratise548 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		print("Enter a string:");
		String testStr = in.nextLine();
        for (int i = 0; i < testStr.length(); ++ i) {
        	if (i % 2 == 0) {
        		System.out.print(testStr.charAt(i));
        	}
        }
	}
}
