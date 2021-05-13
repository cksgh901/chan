package chapter12;


public class Account {

	int money;
	
	// 출금
	synchronized void withdraw() {
		while (money == 0) {
			try {
				wait();
			} catch (Exception e) {
				break;
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName()+ " " +money+"원 출금");
		money = 0;
	}
	
	// 입금
	synchronized void deposit() {
		while (money > 0) {
			try {
				wait();
			} catch (Exception e) {
				break;
			}
		}
		money = (int)(Math.random()*5+1) * 10000; // 1~5만원 랜덤으로 입금
		notifyAll();
		System.out.println(Thread.currentThread().getName()+ " " +money+"원 입금");
	}
}