package chapter06;

public class ClassEx {
	
	public static void main (String[] args) {
		ClassEx c = new ClassEx();
		c.m1();
	}
	void m1() {
		m2();
		System.out.println("1");

	}
	void m2() {
		m3();
		System.out.println("2");

	}
	void m3() {
		System.out.println("3");

	}
	
}



