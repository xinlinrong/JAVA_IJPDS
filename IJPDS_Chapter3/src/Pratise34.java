
public class Pratise34 extends AbstractPratiseImpl {
    @Override
    public void run()
    {
        String monthInEnglish = "";
    	int randomMonth = (int) (Math.random() * 1e6 + 1) % 12;
        switch (randomMonth) {
	        case 1: monthInEnglish = "January"; break;
	        case 2: monthInEnglish = "February"; break;
	        case 3: monthInEnglish = "March"; break;
	        case 4: monthInEnglish = "Apirl"; break;
	        case 5: monthInEnglish = "May"; break;
	        case 6: monthInEnglish = "June"; break;
	        case 7: monthInEnglish = "July"; break;
	        case 8: monthInEnglish = "August"; break;
	        case 9: monthInEnglish = "Semtember"; break;
	        case 10: monthInEnglish = "October"; break;
	        case 11: monthInEnglish = "November"; break;
	        case 12: monthInEnglish = "December"; break;
        }
        this.print("Random output month is %d (%s)", randomMonth, monthInEnglish);
        
    }
}
