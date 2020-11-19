/**
 * ��ϰ 7.6: �޸ĳ����嵥 5-15
 */
public class MyPractise706 extends AbstractPratiseImpl {

	/**
	 * ���������������
	 * @param number
	 * @return
	 */
	public boolean isPrimeRegular(int number)
	{
		boolean isPrime = true;
		for (int i = 2; i < (number / 2); ++ i) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	/**
	 * ���ټ��������㷨
	 * @param number
	 * @return
	 */
	public boolean isPrime(int number)
	{
		boolean isPrime = true;
		int sqrtOfNumber = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrtOfNumber; ++ i) {
        	if (isPrimeRegular(i) && number % i == 0) {
        		isPrime = false;
        		break;
        	}
        }
		return isPrime;
	}
	
	@Override
	public void run()
	{
		int numOfCount = 0, rowColumns = 0, divideNum = 2;
		while (numOfCount<50) {
			if (isPrime(divideNum)) {
				rowColumns++;
				numOfCount ++;
				if (rowColumns == 5) {
					rowColumns = 0;
					printFormatLine("%-4d", divideNum);
				} else {
					printFormat("%-4d ", divideNum);
				}
			}
			++divideNum;
		}
	}
}
