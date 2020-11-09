/**
 * 米与英尺转换的类
 * @author integrate
 */
public class MetreFeetConverter {
	public static final double FOOT_TO_METER_CONST = 0.3050;
    public static final double METER_TO_FEET_CONST = 3.2790;
	
	/**
	 * 英尺转换成米
	 * @param foot
	 * @return double
	 */
    public static double footToMeter(double foot) {
    	return FOOT_TO_METER_CONST * foot;
    }

    /**
     * 米转换成英尺
     * @param meter
     * @return double
     */
    public static double meterToFeet(double meter)
    {
    	return METER_TO_FEET_CONST * meter;
    }
}
