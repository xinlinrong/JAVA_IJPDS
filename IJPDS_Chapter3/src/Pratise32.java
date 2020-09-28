
public class Pratise32 extends AbstractPratiseImpl {
    @Override
    public  void run()
    {
    	long number1 = System.currentTimeMillis() % 10;
    	long number2 = (System.currentTimeMillis() / 10) % 10;
    	long number3 = (System.currentTimeMillis() / 100) % 10;

        this.print("What is %d + %d + %d?", number1, number2, number3);
        
        long answer = this.in.nextLong();

        this.print("%d + %d + %d = answer is %b", 
        		number1, number2, number3, (number1 + number2 + number3 == answer));
    }
}
