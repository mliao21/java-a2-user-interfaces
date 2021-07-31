
/**
 * @author Melissa Liao
 *
 * Class retrieves the number of days of each month of the year.
 * 
 */
public final class Days {
	
	private Days() {}
	
	/**
	 * @param m represents the month
	 * @return to number of days that contains each month
	 * 
	 */
	public static int howManyDays(int m) {
		int days = 0;
				
		if (m == 2) {
			return days = 28;
		}
		
		else if ((m % 2 == 0 && 1 <= m && m <= 7) || (m % 2 != 0 && 8 <= m && m <= 12)) {
			return days = 30;
		}
		
		else if ((m % 2 != 0 && 1 <= m && m <= 7) || (m % 2 == 0 && 8 <= m && m <= 12)) {
			return days = 31;
		}		
		return days;
	}
}


