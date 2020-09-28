public class HomeReview282 implements IPratise {
	public void run() {
		double miles = 100f;
		final double KILOMETERS_PER_MILE = 1.609f;
		double kilometers = miles * KILOMETERS_PER_MILE;
		System.out.println("kilometers is " + kilometers);
	}
}
