/**
 * 练习 4.25 生成车牌号码
 * @author integrate
 */
public class MyPratise425 extends AbstractPratiseImpl {

	/**
	 * 生成英文字母
	 * @return
	 */
	private char generateAlpha()
	{
		int alpha = 'A' + (int)(Math.random() * 26);
		return (char) alpha;
	}
	
	/**
	 * 生成数字
	 * @return
	 */
	private int generateNumber()
	{
		return (int)(Math.random() * 10);
	}
	
	@Override
    public void run()
    {
		this.print("The new License is: %c%c%c%d%d%d%d",
				generateAlpha(), generateAlpha(), generateAlpha(),
				generateNumber(), generateNumber(), generateNumber(), generateNumber()
		);
    }
}
