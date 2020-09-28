public class Pratise39 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
        print("Enter th first 9 digits of an ISBN as integer:");
        String numberOfStr = in.next();
        int calcNum = 0;
        for (int i = 0; i < numberOfStr.length(); ++ i) {
        	calcNum += Integer.parseInt(numberOfStr.substring(i, i+1)) * (i + 1);
        	print("%dx%d=%d", Integer.parseInt(numberOfStr.substring(i, i+1)), (i+1), Integer.parseInt(numberOfStr.substring(i, i+1)) * (i + 1));
        }
        int modVal = calcNum % 11;
        if (modVal == 10) {
        	this.print("The ISBN-10 number is %sX", numberOfStr);
        } else {
        	this.print("The ISBN-10 number is %s%d", numberOfStr, modVal);
        }
    }
}
