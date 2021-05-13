package chapter08;

public class Shark implements Animal {

	@Override
	public void eat() {
		System.out.println("상어가 먹는다.");

	}

	@Override
	public void sleep() {
		System.out.println("상어가 잔다.");

	}

}
