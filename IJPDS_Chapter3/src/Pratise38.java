public class Pratise38 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
        print("Enter three integer:");
		
		int val1 = in.nextInt();
		int val2 = in.nextInt();
		int val3 = in.nextInt();

		int temp = 0;
	    int vals[] = new int[3];
	    vals[0] = val1;
	    vals[1] = val2;
	    vals[2] = val3;
	    for (int i =0; i < 3; ++ i) {
        	for (int j=i+1; j < 3; ++j) {
        		if (vals[i] > vals[j]) {
        			temp = vals[j];
        			vals[j] = vals[i];
        			vals[i] = temp;
        		}
        	}
        }
        
        for (int i = 0; i < 3; ++i) {
        	this.print("%d ", vals[i]);
        } 
	}
}
