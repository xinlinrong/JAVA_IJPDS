public class Pratise35 extends AbstractPratiseImpl {
    /**
     * ��ȡ���ڼ��ַ���
     * @param data
     * @return
     */
	private String getDateBy(int data)
    {
        String dateFor = "";
        switch (data) {
        	case 1: dateFor = "Monday"; break;
        	case 2: dateFor = "Tuesday"; break;
        	case 3: dateFor = "Wednesday"; break;
        	case 4: dateFor = "Thursday"; break;
        	case 5: dateFor = "Friday"; break;
        	case 6: dateFor = "Saturday"; break;
        	case 0: dateFor = "Sunday"; break;
        }
        return dateFor;
    }
	
	/**
	 * ��������������
	 */
	@Override
    public void run()
    {
    	this.print("Enter today's day:");
    	int date = in.nextInt();
    	this.print("Enter the number of days elapsed since today:");
    	int days = in.nextInt();
        int featureDate = (date + days) % 7;
        this.print("Today is %s and the feature day is %s", getDateBy(date), getDateBy(featureDate));
    }
}
