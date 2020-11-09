/**
 * 练习6.10: 使用 isPrime 方法
 * @author integrate
 */
public class MyPractise610 extends AbstractPratiseImpl {
    public static final int LINE_COLUMNS = 20;
	
	@Override
   public void run()
   {
		int checkCounter = 0;
	   for (int i = 1; i < 10000; ++ i) {
		   if (PrimeChecker.isPrime(i)) {
			   if (checkCounter == LINE_COLUMNS) {
				   checkCounter = 0;
				   System.out.printf("%-5d\n", i);
			   } else {
				   ++ checkCounter;
				   System.out.printf("%-5d", i);
			   }
		   }
	   }
   }
}
