package ua.natl.CSPbankAcc;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank("Alex's Bank");
		Bank.Account acc1 = bank.new Account(19890127);
		acc1.Deposit(100);
		acc1.show();
	}
}