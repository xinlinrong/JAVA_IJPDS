/**
 * 练习 5.43: 数学, 组合
 * @author integrate
 */
public class MyPratise543 extends AbstractPratiseImpl {
	@Override
	public void run()
	{
		int combainationCnt = 0;
		for (int i = 1; i < 7; ++ i) {
			for (int j = i+1; j <= 7; ++ j) {
					combainationCnt++;
					System.out.printf("%d %d\n", i, j);
			}
		}
		
		print("The total number of all combinations is %d", combainationCnt);
	}
}
