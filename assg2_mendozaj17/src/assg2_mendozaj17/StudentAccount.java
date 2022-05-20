/**
 * @author - Juan Mendoza
 * Assignment 2
 *  Super class "Student Account" for student's account and their balance
 * this program will retrieve a student's account and their balance 
 */
package assg2_mendozaj17;
public class StudentAccount implements Comparable<StudentAccount>{

	private long acctNo;
	private double bal;
	private static int count;
	
	/**
	 * default constructor
	 */
	public StudentAccount() {
		super();
		this.bal = 0;
		++count;
		acctNo = count;
	}
	
	/**
	 * Constructor with a given balance
	 * @param givenBal the given balance
	 */
	public StudentAccount(double givenBal) {
		super();
		this.bal = givenBal;
		++count;
		acctNo = count;
	}
	
	/**
	 * Retrieve the account number
	 * @return  the acctNo
	 */
	public long getAcctNo() {
		return acctNo;
	}
	
	/**
	 * Retrieve the account balance
	 * @return the bal
	 */
	public double getBalance() {
		return bal;
	}
	
	/**
	 * Retrieve the counter
	 * @return the counter 
	 */
	public int getCounter() {
		return count;
	}
	
	/**
	 * set new balance
	 * @param newBalance the new value for this.bal
	 */
	public void setBalance(double newBalance) {
		this.bal = newBalance;
	}
	
	/**
	 * deposits money into student's account balance. 
	 * @param amt is the amount being deposited. 
	 */
	public void deposit(double amt) {
		if(amt>0) {
			this.bal +=amt;
			System.out.println("Your new balance after your $" + amt + " deposit is: $" + this.bal);
		}
		else {
			System.out.println("Please enter a positive amount.");
			return;
		}
	}
	
	/**
	 * charges to student's account balance
	 * @param charge is the amount to be charged. 
	 */
	public void charge(double charge) {
		if(charge>0) {
		this.bal -= charge;
		System.out.println("Your new balance after your $" + charge + " charge is: $" + this.bal);
		}
		else {
			System.out.println("Please enter a positive amount.");
			return;
		}
	}
	
	/**
	 * Transfers money in from another student account. 
	 * @param stu is the other student account that is doing the transferring.
	 * @param amt is the amount being transferred in. 
	 */
	public void transferIn(StudentAccount stu, double amt) {
		if (amt > 0) {
		this.bal +=amt;
		stu.bal -=amt;
		}
	}
	
	/**
	 * Transfers money out to another student account.
	 * @param stu is the student account that is getting money transferred to. 
	 * @param amt is the amount being transferred out. 
	 */
	public void transferOut(StudentAccount stu, double amt) {
		if (amt > 0) {
		this.bal -=amt;
		stu.bal +=amt;
		}
	}
	
	/**
	 * prints out student's information account/balance
	 */
	public void printInfo() {
		System.out.println("Account number: " + this.acctNo);
		System.out.println("Current Balance: $" + this.bal);
	}
	
	/**
	 * returns a string with account number, and current balance. 
	 * @return returns the string with account number and balance. 
	 */
	@Override
	public String toString() {
		return "Account number: " + this.acctNo + "\n" + "Current balance: " + this.bal;
	}
	
	/**
	 * Compare students' account balance with another student account.
	 * @param s is the student account object being compared. 
	 * @return different numbers either 1, 0, or -1 based on evaluation of comparison.  
	 */
	public int compareTo(StudentAccount s) {
		if (this.bal > s.bal)
			return 1;
		else if (this.bal == s.bal)
			return 0;
		else 
			return -1;
	}
}
