
/**
 * A class to test the Days class.
 * 
 * Runs through all the months 1 - 12 and prints the number of days.
 * 
 * @author Melissa Liao
 *
 */
public class DaysTester {

	public static void main(String[] args) {
		// It will print out the first month and so forth. Then, it will stop until it reaches to the 12th month.
		for (int i = 1; i <= 12; i++) {
			
			System.out.println("Month " + i + " = " + Days.howManyDays(i));
		}
	}

}
