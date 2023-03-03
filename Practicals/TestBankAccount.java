package corejava;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount a = new BankAccount(1000.00,"123456");
		
		System.out.println("Account Number: "+a.getAccountNumber());
		System.out.println("Account Balance: "+a.getBalance());
		a.deposit(500);
		a.withdraw(200);
		System.out.println("New Account Balance: "+a.getBalance());

	}

}
