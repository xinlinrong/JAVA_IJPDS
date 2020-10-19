/**
 * 练习 4.22 检测字符串
 * @author integrate
 */
public class MyPratise422 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		this.print("Enter string s1:");
		String s1 = in.next();
		this.print("Enter string s2:");
		String s2 = in.next();

        if (s1.indexOf(s2) != -1) {
        	this.print("%s is a substring of %s", s2, s1);
        } else {
        	this.print("%s is not a substring of %s", s2, s1);
        }
    }
}
