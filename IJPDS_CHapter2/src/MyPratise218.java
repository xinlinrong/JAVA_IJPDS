import java.util.Scanner;

public class MyPratise218 implements IPratise {
	/**
	 * ¥Ú”°±Ì∏Ò
	 */
    public void run()
    {
        System.out.printf("%-8s%-8s%-8s\n", "a", "b", "pow(a, b)");
        System.out.printf("%-8d%-8d%-8d\n", 1, 2, (int) Math.pow(1, 2));
        System.out.printf("%-8d%-8d%-8d\n", 2, 3, (int) Math.pow(2, 3));
        System.out.printf("%-8d%-8d%-8d\n", 3, 4, (int) Math.pow(3, 4));
        System.out.printf("%-8d%-8d%-8d\n", 4, 5, (int) Math.pow(4, 5));
        System.out.printf("%-8d%-8d%-8d\n", 5, 6, (int) Math.pow(5, 6));
    }
}
