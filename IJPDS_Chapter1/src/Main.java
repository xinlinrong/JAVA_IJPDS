import java.lang.System;
import java.lang.String;
import java.lang.Math;

/**
 * @class Main
 * @description chapter 1 solution
 * @author integrate
 *
 */
public class Main {

	public static double MILE = 1.6;
	public static int SECONDS_PER_HOUR = 3600;
	
	public static void printlnDivLine(String message) {
        System.out.println("=========================================");
		System.out.println(message);
        System.out.println("=========================================");
	}
	
	/**
	 * 执行解答 1-1
	 */
	public static void runSolution_1_1() {
		printlnDivLine("runSolution_1_1");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Program is fun");
	}
	
	/**
	 * 执行解答 1-2
	 */
	public static void runSolution_1_2() {
		printlnDivLine("runSolution_1_2");
		int i = 0;
		for (i = 0; i < 5; ++ i) {
			System.out.println("Welcome to Java");
		}
	}
	
	/**
	 * 执行解答 1-3
	 */
	public static void runSolution_1_3() {
		printlnDivLine("runSolution_1_3");
		System.out.println("    J     A     V     V     A");
		System.out.println("    J    A A     V   V     A A");
		System.out.println("J   J   AAAAA     V V     AAAAA");
		System.out.println(" J J   A     A     V     A     A");
	}
	
	/**
	 * 执行解答 1-4
	 */
	public static void runSolution_1_4() {
		printlnDivLine("runSolution_1_4");
        System.out.printf("%-7s%-7s%-7s\n", "a", "a^2", "a^3");
        System.out.printf("%-7d%-7d%-7d\n", 1, 1, 1);
        System.out.printf("%-7d%-7d%-7d\n", 2, 4, 8);
        System.out.printf("%-7d%-7d%-7d\n", 3, 9, 27);
        System.out.printf("%-7d%-7d%-7d\n", 4, 16, 64);
	}

	/**
	 * 执行解答 1-5
	 */
	public static void runSolution_1_5() {
		printlnDivLine("runSolution_1_5");
		double result = ((9.5f * 4.5f) - (2.5f * 3)) / (45.5 - 3.5);
        System.out.println("9.5 x 4.5 - 2.5 x 3");
        System.out.println("----------------");
        System.out.println("     45.5 - 3.5     ");
        System.out.println("result is: " + result);
	}

	/**
	 * 执行解答 1-6
	 * @param int n
	 */
	public static void runSolution_1_6(int n) {
		int result = 0;
        for (int i = 0; i <= n; ++i) {
        	result += i;
        }

		printlnDivLine("runSolution_1_5");
        System.out.println("n is:" + n);
        System.out.println("result is:" + result);
	}
	
	/**
	 * 解答 1-7 的辅助函数
	 * @param n
	 * @return
	 */
	private static double helperForSulotion_1_7(int n) {
		double result = 0.0f;
	    for (int i = 1; i <= n; ++i) {
            result += Math.pow(-1.0, i-1)  / (2 * i - 1);
        }
	    return 4.0f * result;
	}
	
	/**
	 * 执行解答 1-7
	 */
	public static void runSolution_1_7() {
		printlnDivLine("runSolution_1_7");
		System.out.println("result of 1-1/3+1/5-1/7+1/9-1/11 is:" + helperForSulotion_1_7(1000));
		System.out.println("result of 1-1/3+1/5-1/7+1/9-1/11+1/15 is:" + helperForSulotion_1_7(1001));
	}
	
	/**
	 * 执行解答 1-8
	 * @param r 半径
	 */
	public static void runSolution_1_8(double r) {
		double pi = helperForSulotion_1_7(10000);
		printlnDivLine("runSolution_1_8");
        System.out.println("d is 5.5");
        System.out.println("width is 2 x r x pi = " + (2.0f * r * pi));
        System.out.println("squares is r x r x pi = " + (r * r * pi));
	}
	
	/**
	 * 执行解答 1-9
	 * @param width
	 * @param high
	 */
	public static void runSolution_1_9(double width, double height) {
		printlnDivLine("runSolution_1_9");
		System.out.printf("Area of rectangle (%.2f x %.2f) is %.2f", width, height, (width * height));
	}
	
	/**
	 * 执行解答 1-10
	 * @param time
	 * @param distance
	 */
	public static void  runSolution_1_10(Integer time, Double distance) {
		printlnDivLine("runSolution_1_9");
		if (distance.equals(0.0f)) {
			System.out.println("distance can not be set zero");
			return;
		}

		double spendHours = (time * 1.0 / SECONDS_PER_HOUR);
	    double speed = (distance / spendHours) / MILE;
        System.out.printf("You spend %.2f hours to run %.2f kilograms, your speed is %f miles/h\n", spendHours, distance, speed);
	}
	
	/**
	 * 执行解答 1-11
	 * @param initNumeric
	 * @param bornOneSecs
	 * @param dieOneSecs
	 * @param migrateOneSecs
	 * @param daysPerYear
	 * @param totalYears
	 */
	public static void runSolution_1_11(
			long initPopulation, 
			int bornOneSecs, 
			int dieOneSecs, 
			int migrateOneSecs,
			int daysPerYear,
			int totalYears) {
		printlnDivLine("runSolution_1_11");
		long population = initPopulation;
        long totalSeconds = daysPerYear * totalYears * 86400;
        long diePopulation = totalSeconds / dieOneSecs;
        long bornPopulation = totalSeconds / bornOneSecs;
        long migratePopulation = totalSeconds / migrateOneSecs;

        System.out.printf("America population now is %d\n", initPopulation);
	    System.out.printf("In %d\n", totalYears);
	    System.out.printf("will born %d\n", bornPopulation);
	    System.out.printf("will die %d\n", diePopulation);
	    System.out.printf("will die %d\n", migratePopulation);
        System.out.printf("total population is %d\n", (population + bornPopulation + migratePopulation - diePopulation));
	}

	/**
	 * 执行解答 1-12
	 * @param time
	 * @param distanceInMile
	 */
	public static void runSolution_1_12(int time, double distanceInMile)
	{
		printlnDivLine("runSolution_1_12");
        double spendHours = 1.0 * time / SECONDS_PER_HOUR;
        double distancesInKiloGram = distanceInMile * MILE;
        double speed = distancesInKiloGram / spendHours;
        System.out.printf("Your run %.2f km in %.2f hours, avrange speend is %.2f mk/h\n", distancesInKiloGram, spendHours, speed);
	}
	
	public static void runSolution_1_13(
			double valA, double valB, double valC,
			double valD, double valE, double valF
    ) {
		printlnDivLine("runSolution_1_13");
        System.out.printf("%fx + %fy = %f\n", valA, valB, valE);
        System.out.printf("%fx + %fy = %f\n", valC, valD, valF);
        double valX = ((valE * valD) - (valB - valF)) / ((valA * valD) - (valB * valC));
        double valY = ((valA * valF) - (valE - valC)) / ((valA * valD) - (valB * valC));
        System.out.printf("x value is %.2f, y value is %.2f", valX, valY);
	}
	
	public static void main(String[] args) {
        runSolution_1_1();
        runSolution_1_2();
        runSolution_1_3();
        runSolution_1_4();
        runSolution_1_5();
        runSolution_1_6(9);
        runSolution_1_7();
        runSolution_1_8(5.5);
        runSolution_1_9(4.5, 7.9);
        runSolution_1_10(2730, 14.0);
        runSolution_1_11(312032486, 7, 13, 45, 365, 5);
        runSolution_1_12(6035 , 24.0);
        runSolution_1_13(3.4, 50.2, 2.1, 0.55, 44.5, 5.9);
        return;
	}
}
