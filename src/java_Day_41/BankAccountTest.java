package java_Day_41;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		
		myAccount.accountHolder = "Megan";
		myAccount.accountNumber = 1234567;
		myAccount.balance = 900;
		
		myAccount.deposit(500);
		myAccount.withdrawal(215);
		myAccount.showBalance();
		myAccount.charge(1000, "Awesome pizza party");
		
	}
}
