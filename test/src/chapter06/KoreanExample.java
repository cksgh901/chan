package chapter06;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","01225-1234567");
		System.out.println("k1.name :" + k1.name);
		System.out.println("k1.snn :" + k1.snn);

		
		Korean k2 = new Korean("김자바","930525-0654321");
		System.out.println("k1.name :" + k2.name);
		System.out.println("k1.snn :" + k2.snn);
	}

}
