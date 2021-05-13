package chapter08;

public class Eagle implements Animal {

	@Override
	public void eat() {
		System.out.println("독수리가 먹는다");

	}

	@Override
	public void sleep() {
		System.out.println("독수리가 잔다");

	}
	
	public void fly() {
		System.out.println("독수리가 날다.");
	}

}
