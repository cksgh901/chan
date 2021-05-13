package chapter06;

public class MathodEx {

	public static void main(String[] args) {
		MathodEx c = new MathodEx();
		System.out.println(c.divide(c.pow(c.add(3, 3))));
		
		MathodEx d = new MathodEx();
		int r = c.execute(d);
		System.out.println(r);
	}
	int add(int x, int y) {
		return x+y;
	}
	int pow(int x) {
		return x*x;
	}
	int divide(int x) {
		return x/2;
	}
	int execute (MathodEx c) {
		return c.add(3, 3);
	}

}
