/**
 * ��ϰ 7.5: ��ӡ��ͬ����
 */
public class MyPractise705 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		// ��ȡ 10 ����
		printLine("Enter 10 numbers");
		int[] numberOfDigits = new int[10];
        for (int i = 0; i < 10; ++ i) {
        	numberOfDigits[i] = in.nextInt();
        }

	    int distinctCnt = 0;
	    int[] distinctNums = new int[10];

	    // ѭ����ѯ��Ψһ��ֵ
	    for (int i = 0; i < numberOfDigits.length; ++ i) {
	    	boolean hasFind = false;
	    	for (int j = 0; j < distinctCnt - 1; ++ j) {
	    		if (numberOfDigits[i] == distinctNums[j]) {
	    			hasFind = true;
	    			break;
	    		}
	    	}

	        if (!hasFind) {
	        	distinctCnt ++;
	        	distinctNums[distinctCnt-1] = numberOfDigits[i];
	        }
	    }
	    
	    printFormatLine("The number if distinct number is %d", distinctCnt);
	    print("The distinct numbers are: ");
        for (int i = 0; i < distinctCnt; ++ i) {
        	printFormat("%d ", distinctNums[i]);
        }
        printLine("");
	}
}
