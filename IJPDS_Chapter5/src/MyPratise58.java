/**
 * 练习 5.8: 找出分数最高的学生
 * @author integrate
 */
public class MyPratise58  extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		int total = 0, score = 0, maxScore = 0;
        this.print("Please input total students.");
        total = in.nextInt();
        if (total < 0) {
        	this.print("Invalid input");
        	System.exit(-1);
        }
        
        String name = "";
        String maxScoreName = "";
        for (int i = 0; i < total; ++ i) {
        	score = in.nextInt();
        	name = in.next();
            if (score > maxScore) {
            	maxScore = score;
            	maxScoreName = name;
            }
        }

        this.print("The heighest score is %d", maxScore);
        this.print("Max score student is %s", maxScoreName);
    }
}
