package chapter08;

public class Eagle implements Animal {

	@Override
	public void eat() {
		System.out.println("�������� �Դ´�");

	}

	@Override
	public void sleep() {
		System.out.println("�������� �ܴ�");

	}
	
	public void fly() {
		System.out.println("�������� ����.");
	}

}
