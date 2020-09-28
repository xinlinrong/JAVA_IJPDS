import java.util.Scanner;

public class Pratise37 extends AbstractPratiseImpl {
	/**
	 * 金融应用: 货币单位
	 */
     public void run()
     {
         this.print("Enter an amount in Integer, for example 11.56 ($11.56)");

         double originAmount = in.nextDouble();
         long amount = (long) (originAmount * 100.0);
         
         // calculate one dollor
         long numberOfOneDollors = amount / 100;
         amount %= 100;

         // calculate quarters
         long numberOfQuarters = amount / 25;
         amount %= 25;

         // calculate dimes
         long numberOfDimes = amount / 10;
         amount %= 10;

         // calculate nickle
         long numberOfNickles = amount / 5;
         amount %= 5;

         // calculate pennies
         long numberOfPennies = amount;

         String amountStr = "";
         if (numberOfOneDollors > 0) {
        	 amountStr += String.format("%d dollor", numberOfOneDollors);
        	 amountStr += (numberOfOneDollors > 1) ? "s " : " ";
         }

         if (numberOfQuarters > 0) {
        	 if (numberOfOneDollors > 0) amountStr += "and ";
        	 amountStr += String.format("%d quarter", numberOfQuarters);
        	 amountStr += (numberOfQuarters > 1) ? "s " : "";
         }

         if (numberOfDimes > 0) {
        	 if (numberOfQuarters > 0) amountStr += "and ";
        	 amountStr += String.format("%d dime", numberOfDimes);
        	 amountStr += (numberOfDimes > 1) ? "s " : " ";
         }

         if (numberOfNickles > 0) {
        	 if (numberOfDimes > 0) amountStr += "and ";
        	 amountStr += String.format("%d nickle", numberOfNickles);
        	 amountStr += (numberOfNickles > 1) ? "s " : " ";
         }

         if (numberOfPennies > 0) {
        	 if (numberOfDimes > 0) amountStr += "and ";
        	 amountStr += String.format("%d pennie", numberOfPennies);
        	 amountStr += (numberOfPennies > 1) ? "s " : " ";
         }
         
         this.print(amountStr);
     }
}
