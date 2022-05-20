/**
 * @author - Juan Mendoza
 * This class is used to test StudentAccount and RewardsAccount classes. 
 */
package assg2_mendozaj17;
public class StudentAccountDemo {

	public static void main(String[] args) {
		//Test constructors:
		StudentAccount s1 = new StudentAccount();
		StudentAccount s2 = new StudentAccount(150);
		RewardsAccount r3 = new RewardsAccount(400);
		RewardsAccount r4 = new RewardsAccount(1000);
		StudentAccount s5 = new StudentAccount(100);
		StudentAccount s6 = new StudentAccount(200);
		StudentAccount s7 = new StudentAccount(8);
		StudentAccount s8 = new StudentAccount(150);
		StudentAccount s9 = new StudentAccount(500);
		StudentAccount s10 = new StudentAccount(700);
		StudentAccount s11 = new StudentAccount(500);
		RewardsAccount r12 = new RewardsAccount(100);

		
		//Test get/set methods of Student Account:
		s1.setBalance(2000);
		System.out.println("s1: Account: " + s1.getAcctNo());
		System.out.println("s1: Balance: $" + s1.getBalance());
		System.out.println("Account created counter: " + s1.getCounter());
		
		//Test deposit/charge methods:
		System.out.println();
		s1.deposit(100000);
		s2.deposit(-100);
		System.out.println();
		s1.charge(9000);
		s2.charge(-500);
	
		//Test transferIn/TransferOut methods and printInfo for StudentAccount class.
		System.out.println("\nTesting transfer methods and printinfo for Super class: ");
		s5.transferIn(s6, 100);
		s5.printInfo();
		System.out.println();
		s6.printInfo();
		System.out.println();
		s7.transferOut(s8, 2);
		s7.printInfo();
		System.out.println();
		s8.printInfo();
		
		//Test toString method for StudentAccount class:
		System.out.println("\ninfo for s1: " + s1.toString());
		
		//Test compareTo method for StudentAccount class:
		System.out.println();
		if(s9.compareTo(s10)==1)
			System.out.println("The balance of s9 is greater than s10.");
		else if (s9.compareTo(s10) == 0)
			System.out.println("The balance of s9 is the same as s10.");
		else
			System.out.println("The balance of s9 is less than s10.");
		
		if(s9.compareTo(s11) == 1)
			System.out.println("The balance of s9 is greater than s11");
		else if (s9.compareTo(s11) == 0)
			System.out.println("The balance of s9 is the same as s11.");
		else
			System.out.println("The balance of s9 is less than s11.");
				
		if(s10.compareTo(s9) == 1)
			System.out.println("The balance of s10 is greater than s9");
		else if (s10.compareTo(s9) == 0)
			System.out.println("The balance of s10 is the same as s9.");
		else
			System.out.println("The balance of s10 is less than s9.");	

		//Test getRewards and redeemRewards for RewardsAccount class. 
		System.out.println("");
		r12.deposit(100);
		r12.deposit(100);
		r12.deposit(200);
		r12.deposit(100);
		r12.redeemRewards();
		r12.printInfo();
		
		System.out.println("\nRewards for r3: $" + r3.getRewards());
		System.out.println("r3: $" + r3.redeemRewards());
		
		//Test toString method for RewardsAccount class.
		System.out.println("\n"+r3.toString());
		
		//Test deposit method and printInfo for RewardsAccount class.
		System.out.println();
		r3.deposit(50000);
		r3.deposit(-1000);
		r4.printInfo();
	}

}
