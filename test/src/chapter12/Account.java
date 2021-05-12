package chapter12;


public class Account {

	int money;
	
	// ���
	synchronized void withdraw() {
		while (money == 0) {
			try {
				wait();
			} catch (Exception e) {
				break;
			}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName()+ " " +money+"�� ���");
		money = 0;
	}
	
	// �Ա�
	synchronized void deposit() {
		while (money > 0) {
			try {
				wait();
			} catch (Exception e) {
				break;
			}
		}
		money = (int)(Math.random()*5+1) * 10000; // 1~5���� �������� �Ա�
		notifyAll();
		System.out.println(Thread.currentThread().getName()+ " " +money+"�� �Ա�");
	}
}