package chapter07;

public class Driver  {
	public void drive(Vehichle vehichle) {
		vehichle.run();
	}
	public void test(Object obj) { // obj�� Bus �� �ν��Ͻ�����
		Bus bus = (Bus) obj;
		bus.run();
		//System.out.println();
	}

}
