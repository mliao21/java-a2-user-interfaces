/**
 * Class representing a certificate of deposit.
 * 
 * @author Melissa Liao
 *
 */
public class BankCD {
	
	private double principal;
	private double rate;
	private double years;
	
	/**
	 * @param p represents principal or original investment amount
	 * @param r represents annual interest rate
	 * @param y represents number of years of compounding period
	 */
	public BankCD(double p, double r, double y) {
		this.principal = p;
		this.rate = r;
		this.years = y;
	}
	
	public double calcYearly() {
		// formula for compounding yearly interest
		return (this.principal * Math.pow(1 + this.rate, this.years));
	}
	
	public double calcDaily() {
		// formula for compounding daily interest
		return (this.principal * Math.pow(1 + (this.rate/365), (this.years*365)));		
	}

}
