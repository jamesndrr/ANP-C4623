package corejava;

public class BankAccount {
	private double balance;
	private String accountNumber;
	//create parameterized constructor
	public BankAccount(double balance, String accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	//create getter setter methods
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	//create deposit method to add the amount fromn the balance
	public void deposit(double amount) {
		balance += amount;
	}
	//create withdraw method to deduct the amount from the balance
	public void withdraw(double amount) {
		balance -= amount;
	}
}
