/**
 * 练习 5.9: 找出分数最高的前两个学生
 * @author integrate
 */
public class MyPratise59  extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		int total = 0, score = 0, maxScore = 0, secondScore = 0;
        this.print("Please input total students.");
        total = in.nextInt();
        if (total < 0) {
        	this.print("Invalid input");
        	System.exit(-1);
        }
        
        String name = "", maxScoreName = "", secondScoreName = "";
        for (int i = 0; i < total; ++ i) {
        	score = in.nextInt();
        	name = in.next();
        	if (i == 0) {
            	maxScore = score;
            	secondScore = score;
            	maxScoreName = name;
            	secondScoreName = name;
            	continue;
        	}

        	if (score > maxScore) {
            	maxScore = score;
            	maxScoreName = name;
            } else if (score > secondScore  && score < maxScore) {
            	secondScore = score;
            	secondScoreName = name;
            }
        }

        this.print("The first score is %d", maxScore);
        this.print("First score student is %s", maxScoreName);
        this.print("The second score is %d", secondScore);
        this.print("Second score student is %s", secondScoreName);
    }
}
