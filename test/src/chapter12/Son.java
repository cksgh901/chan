package chapter12;

public class Son extends Thread {
	
	Account account;
	Son(Account account){
		super("�Ƶ�");
		this.account = account;
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				account.withdraw();
				sleep((int)(Math.random()*300));
			}catch(Exception e) {
				break;
			}
			
		}
	}

}
