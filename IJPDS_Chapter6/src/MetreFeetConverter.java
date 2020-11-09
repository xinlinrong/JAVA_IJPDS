/**
 * ����Ӣ��ת������
 * @author integrate
 */
public class MetreFeetConverter {
	public static final double FOOT_TO_METER_CONST = 0.3050;
    public static final double METER_TO_FEET_CONST = 3.2790;
	
	/**
	 * Ӣ��ת������
	 * @param foot
	 * @return double
	 */
    public static double footToMeter(double foot) {
    	return FOOT_TO_METER_CONST * foot;
    }

    /**
     * ��ת����Ӣ��
     * @param meter
     * @return double
     */
    public static double meterToFeet(double meter)
    {
    	return METER_TO_FEET_CONST * meter;
    }
}
