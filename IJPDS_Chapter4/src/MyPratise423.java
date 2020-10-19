/**
 * 练习 4.22 金融应用:酬金
 * @author integrate
 */
public class MyPratise423 extends AbstractPratiseImpl {
	@Override
    public void run()
    {
		// 输入名称
		this.print("Enter employee's name:");
		String name = in.next();

		// 输入一周工作时间
        this.print("Enter number of hours worked in a week");
        double workedHours = in.nextDouble();

        // 输入时薪
        this.print("Enter hourly pay rate:");
        double payRate = in.nextDouble();

        // 联邦所得税税率
        this.print("Enter federal tax withholding rate:");
        double federalTaxRate = in.nextDouble();

        // 州所得税税率
        this.print("Enter state tax withholding rate:");
        double stateTexRate = in.nextDouble();
 
        double grossPay = payRate * workedHours;
        double federalTax = grossPay * federalTaxRate;
        double stateTax = grossPay * stateTexRate;
        
        this.print("Employee Name: %s", name);
        this.print("Hour worked %.1f", workedHours);
        this.print("Pay Rate: $%.2f", payRate);
        this.print("Gross Pay: $%.1f", grossPay);
        this.print("Deductions:");
        this.print("  Federal Withholding(%.1f): $%.1f", (federalTaxRate * 100.0), federalTax);
        this.print("  State Withholding(%.1f): $%.2f", (stateTexRate * 100.0), stateTax);
        this.print("  Total Deduction $%.2f", federalTax + stateTax);
        this.print("Net pay: $%.2f", (grossPay - federalTax - stateTax));
    }
}
