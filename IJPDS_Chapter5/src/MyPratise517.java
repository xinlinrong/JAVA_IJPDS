/**
 * ��ϰ 5.17: ��ʾ������
 * @author integrate
 */
public class MyPratise517 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
        this.print("Enter the number of lines:");
        int numOfLines = in.nextInt();
        if (numOfLines <= 0) {
        	print("Number of lines must be greater than 0");
        	System.exit(-1);
        }

        for (int i = 0; i < numOfLines; ++i) {
        	for (int j = 0; j <  numOfLines + i; ++ j) {
        		if (j >= numOfLines -1 - i && j <= numOfLines -1 + i) { // �Ե�
        			if (j < numOfLines) {
        				System.out.printf("%-4d", (numOfLines - j));
        			} else {
        				System.out.printf("%-4d", (j - numOfLines + 2));
        			}
        		} else {
        			System.out.print("  ");
        		}
        	}
        	System.out.println("");
        }
    }
}
