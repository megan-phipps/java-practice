package java_Day_19;

import java.util.*;

public class Warm_Up_Transactions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double transactionAmount = 0;
		double balance = 0;
		int count = 0;

		System.out.println("What is your current balance?");
		balance = scan.nextDouble();

		while (balance > 0) {
			++count;
			System.out.println("What is your transaction #" + count + " amount?");
			transactionAmount = scan.nextDouble();

			if (transactionAmount > balance) {
				System.out.println("Warning! This transaction will overdrawal your account!");
			}
			if (transactionAmount == balance) {
				System.out.println("Warning, this transaction will bring your account to a zero dollar balance.");
			}
			balance -= transactionAmount;
			System.out.println("balance after transaction will be: $" + balance);

		}
	
	
	
	
	
	
	
	
	
	
	}
}
