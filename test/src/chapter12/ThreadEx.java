package chapter12;

public class ThreadEx {

	public static void main(String[] args) {
		// ���尴ü
		Account account = new Account();
		
		// ���������� ��ü ����
		Mother mother = new Mother(account);
		// �Ƶ齺���� ��ü ����
		Son son = new Son(account);
		
		mother.start();
		son.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			
		}
		
		// ������ ����
		mother.interrupt();
		son.interrupt();
	}

}