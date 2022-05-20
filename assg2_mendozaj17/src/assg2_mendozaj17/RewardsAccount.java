/**
 * @author - Juan Mendoza
 * Subclass: Rewards Account for students.
 * this class is a subclass of StudentAccount class to keep track of students' rewards. 
 */
package assg2_mendozaj17;
public class RewardsAccount extends StudentAccount{

	private double rewards = 0;
	
	/**
	 * default constructor
	 */
	public RewardsAccount() {
		super();
		rewards = 0;
	}
	
	/**
	 * Constructor with given balance
	 * @param initBalance is the initial balance.
	 */
	public RewardsAccount(double initBalance) {
		super(initBalance);
		if (initBalance >=100)
			rewards = 5;
	}
	
	/**
	 * Retrieves the rewards balance 
	 * @return the rewards
	 */
	public double getRewards() {
		return rewards;
	}
	
	/**
	 * Redeems rewards to student account if possible. 
	 * @return the rewards 
	 */
	public double redeemRewards() {
		if(this.rewards>=25) {
			double bal = getBalance();
			setBalance(bal+rewards);
			rewards = 0;
			System.out.println("Rewards redeemed!");
		}
		else {
				System.out.println("Insufficient amount: rewards amount is less than $25.");
		}
			return rewards;
		}
	/**
	 * returns a string with account number, balance, and rewards balance. 
	 * @return returns account number, balance, and rewards. 
	 */
	@Override
	public String toString() {
		return ("Account number: " + getAcctNo() + "\nCurrent balance: $" + getBalance() + "\nRewards balance: $" + this.rewards);
	}
	
	/**
	 * will deposit +$5 if deposit amount is greater than $100
	 */
	@Override
	public void deposit(double amt) {
		if (amt > 0) {
			double balance = getBalance();
			setBalance(balance + amt);
			if(amt >=100)
				rewards +=5;
			System.out.println("The account balance is updated! $" + this.getBalance());
		}
	}
	
	/**
	 * prints out students info to screen with their account. 
	 */
	@Override
	public void printInfo() {
		System.out.println("Account Number: " + getAcctNo());
		System.out.println("Current balance: $" + getBalance());
		System.out.println("Rewards balance: $" + rewards);
	}
}
