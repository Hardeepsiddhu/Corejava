package in.com.batch;

public class Atm {
	private int balance =0;
	public void setBalance(int balance) {
		this.balance= balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amt) {
		int total = getBalance() + amt;
		setBalance(total);
		System.out.println(" balance after deposit= " + getBalance());
	}
	public void withdrawal(int amt) {
		int total = getBalance() - amt;
		if(total<2000) {
			System.out.println("Insufficient Balance!!");
		}
		else {
			setBalance(total);
			System.out.println("Balance after withdrawal" + getBalance());
		}
	}
	
}
