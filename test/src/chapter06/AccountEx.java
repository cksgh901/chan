package chapter06;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setbalance(10000);
		System.out.println("현재잔고 : "+ account.getbalance());
		
		account.setbalance(-100);
		System.out.println("현재잔고 : "+ account.getbalance());
		
		account.setbalance(2000000);
		System.out.println("현재잔고 : "+ account.getbalance());
		
		account.setbalance(300000);
		System.out.println("현재잔고 : "+ account.getbalance());

	}

}
