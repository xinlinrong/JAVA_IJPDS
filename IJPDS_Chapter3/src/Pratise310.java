
public class Pratise310 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
    	int number1 = (int)(Math.random() * 100.0);
    	int number2 = (int)(Math.random() * 100.0);
        print("What's answer to expression %d - %d", number1, number2);

        int answer = in.nextInt();
        boolean result = (answer == (number1 - number2));
        print("Expression %d - %d = %d is %s", number1, number2, (number1 - number2), result ? "right" : "wrong");
    }
}