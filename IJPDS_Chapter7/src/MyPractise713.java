/**
 * 练习 7.13: 随机数选择器
 */
public class MyPractise713 extends AbstractPratiseImpl {

	/**
	 * 生成方法
	 * @param numbers
	 * @return
	 */
	public static int getRandom(int ...numbers)
	{
		if (numbers.length == 0) {
			return ((int) Math.random() * 55);
		} else {
			boolean hit = false;
			int guessNumber = 0;
			do {
				hit = false;
				guessNumber = ((int) (Math.random() * 55 + 1));
				for (int i = 0; i < numbers.length; ++ i) {
					if (guessNumber == numbers[i]) {
						hit = true;
						break;
					}
				}
			} while (hit);
			return guessNumber;
		}
	}
	
	@Override
	public void run()
	{
		int[] numList = {
				1, 2, 3 ,4, 5, 6, 7, 8, 9, 10, 
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
				41, 42, 43, 44, 45, 46, 47, 48, 49, 50
		};
		printFormatLine("Generate random integer is %d", getRandom(numList));
	}
}
