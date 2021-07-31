import java.text.NumberFormat;
import java.util.Locale;
/**
 * Class representing command-line interface to compute 
 * yearly and daily compounded certificate of deposit.
 *  
 * @author Melissa Liao
 *
 */
public class BankCDApp {
	
	private BankCD bank;
	private KeyboardReader reader;
	
	public BankCDApp() {
		
		reader = new KeyboardReader();
	}
	
	public void run() {

		System.out.println("Compare daily and annual compounding for a Bank CD.");
		
		double principal = 0.0;
		double rate = 0.0;
		double years = 0.0;
		
		reader.prompt("Input CD initial principal, e.g.  1000.55 > ");
		principal = reader.getKeyboardDouble();
		reader.prompt("Input CD interest rate, e.g.  6.5 > ");
		rate = reader.getKeyboardDouble();
		reader.prompt("Input the number of years to maturity, e.g., 10.5 > ");
		years = reader.getKeyboardDouble();
		
		// Input values by user will be formatted in readable units
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA);
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(1);
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		
		// BankCD class is instantiated to use values input by the user
		BankCD cd = new BankCD(principal, (rate/100), years);	
		System.out.println("For Principal= " + currency.format(principal) + " Rate= " + percent.format(rate/100) + " Years= " + number.format(years));		
		// Yearly and daily compound interest is calculated
		System.out.println("The maturity value compounded yearly is " + currency.format(cd.calcYearly()));
		System.out.println("The maturity value compounded daily is " + currency.format(cd.calcDaily()));		
	}

	public static void main(String[] args) {
		
		BankCDApp app = new BankCDApp();
		app.run();
		

	}

}
