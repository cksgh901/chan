package chapter08;

public class Lion implements Animal {

	@Override
	public void eat() {
		System.out.println("사자가 먹는다.");

	}

	@Override
	public void sleep() {
		System.out.println("사자가 잔다.");

	}

}
