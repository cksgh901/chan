package pratice;

public class AccountEx {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setbalance(10000);
		System.out.println("ÇöÀçÀÜ°í : "+ acc.getbalance());
		
		acc.setbalance(-100);
		System.out.println("ÇöÀçÀÜ°í : "+ acc.getbalance());
		
		acc.setbalance(2000000);
		System.out.println("ÇöÀçÀÜ°í : "+ acc.getbalance());

		acc.setbalance(30000);
		System.out.println("ÇöÀçÀÜ°í : "+ acc.getbalance());
	}

}
