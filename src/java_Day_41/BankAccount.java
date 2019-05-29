package java_Day_41;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNumber;
	
	
	public void deposit(double amount) {
		System.out.println("Depositing $" + amount + " to account " + accountNumber);
		balance += amount;
	}
	
	public void withdrawal(double amount) {
		System.out.println("Withdrawaling $" + amount + " from account " + accountNumber);
		balance -= amount;
		if(balance < 0) {
			balance -= 35;
			System.out.println("You have been charged an overdraft fee of $35");
		}
	}
	
	public void showBalance() {
		System.out.println("================================");
		System.out.println("account holder " + accountHolder);
		System.out.println("account number " + accountNumber);
		System.out.println("balance " + balance);
		System.out.println("================================");
	}
	
	public void charge(double price, String item) {
		if(balance >= price) {
			balance-= price;
			System.out.println("sucessful transaction. Your current balance is now " + balance);
		}else {
			System.out.println("Insufficient funds. Cannot purchase " + item);
		}
	}
	
	
}
