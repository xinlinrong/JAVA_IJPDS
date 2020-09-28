public class Pratise326 extends AbstractPratiseImpl {
	/**
	 * Ê¹ÓÃ²Ù×÷·û &&, ||, ^
	 */
    @Override
    public void run()
    {
    	print("Enter an integer:");
    	int value = in.nextInt();
        print("Is %d divisable by 5 and 6? %b.", value, ((value % 5 == 0) && (value %6 == 0)));
        print("Is %d divisable by 5 or 6? %b.", value, ((value % 5 == 0) || (value %6 == 0)));
        print("Is %d divisable by 5 or 6, but not both? %b.", value, ((value % 5 == 0) ^ (value %6 == 0)));
    }
}
