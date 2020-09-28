public class Pratise36 extends AbstractPratiseImpl {

	// 磅数量
	private final double KILOGRAMS_PER_POUND = 0.45359237;

	// 英寸数量
	private final double METER_PER_INCH = 0.0254;
	
	/**
     * 健康应用: BMI 指数
     */
	@Override
    public void run()
    {
		// 获取重量
    	this.print("Enter weight in pounds:");
    	double pounds = this.in.nextDouble();

        // 获取高度
        this.print("Enter height in inches");
        double inches = this.in.nextDouble();

        double kilogram = pounds * KILOGRAMS_PER_POUND;
        double height = inches * METER_PER_INCH;
        double bmi = kilogram / Math.pow(height, 2.0);

        this.print("bmi is %.6f", bmi);
        if (bmi > 30.0) {
        	this.print("Obese");
        } else if (bmi >= 25.0) {
        	this.print("Overweight");
        } else if (bmi >= 18.5) {
        	this.print("Normal");
        } else {
        	this.print("Underweight");
        }
    }
}
