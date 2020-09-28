import java.util.Scanner;

public class MyPratise222 implements IPratise{
	/**
	 * 金融应用: 货币单位
	 */
     public void run()
     {
    	 Scanner in = new Scanner(System.in);
         System.out.print("Enter an amount in Integer, for example 1156 ($11.56)");

         int originAmount = in.nextInt();
         int amount = originAmount;
         
         // calculate one dollors
         int numberOfOneDollors = amount / 100;
         amount %= 100;

         // calculate quarters
         int numberOfQuarters = amount / 25;
         amount %= 25;

         // calculate dimes
         int numberOfDimes = amount / 10;
         amount %= 10;

         // calculate nickles
         int numberOfNickles = amount / 5;
         amount %= 5;

         // calculate pennies
         int numberOfPennies = amount;

         System.out.printf("Your amount %.2f cost of:\n", originAmount/100.0);
         System.out.printf("numberOfOneDollors %d\n", numberOfOneDollors);
         System.out.printf("numberOfQuarters %d\n", numberOfQuarters); 
         System.out.printf("numberOfDimes %d\n", numberOfDimes);
         System.out.printf("numberOfNickles %d\n", numberOfNickles);
         System.out.printf("numberOfPennies %d\n", numberOfPennies);
     }
}