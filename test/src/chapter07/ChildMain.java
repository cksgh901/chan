package chapter07;

public class ChildMain {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = c;
		
		p.method1();
		p.method2();
		//p.method3(); ºÒ°¡´É
		
		
	}

}
