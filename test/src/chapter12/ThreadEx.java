package chapter12;

public class ThreadEx {

	public static void main(String[] args) {
		// 통장객체
		Account account = new Account();
		
		// 엄마스레드 객체 생성
		Mother mother = new Mother(account);
		// 아들스레드 객체 생성
		Son son = new Son(account);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			
		}
		
		// 스레드 중지
		mother.interrupt();
		son.interrupt();
	}

}