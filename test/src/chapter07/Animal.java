package chapter07;

public abstract class  Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을쉽니다.");
	}
	
	public abstract void sound();

}
