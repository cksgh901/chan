package chapter07;

public class Driver  {
	public void drive(Vehichle vehichle) {
		vehichle.run();
	}
	public void test(Object obj) { // obj가 Bus 의 인스턴스인지
		Bus bus = (Bus) obj;
		bus.run();
		//System.out.println();
	}

}
