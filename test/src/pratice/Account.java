package pratice;

public class Account {
	final static int Min_balance = 0;
	final static int Max_balance = 1000000;
	
	private int balance = 0;
	void setbalance(int balance) {
	if(balance>=Min_balance && balance<=Max_balance) {
		this.balance = balance;
	}
}
	int getbalance() {
		return balance;
	}
	
}
