package chapter12;

public class Mother extends Thread {
	Account account;
	
	Mother(Account account){
		super("����");
		this.account = account;
	}
	@Override
	public void run() {
		while (true) {
			try {
			account.deposit();
			sleep((int)(Math.random()*2000));
		}catch (Exception e) {
			break;}
		}
	}

}
