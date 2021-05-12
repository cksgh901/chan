package chapter07;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver =  new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehichle  v1 = new Bus();
		v1 = new Taxi();
//		
//		driver.test(driver);
//		driver.test(new Bus());
//		driver.test(1); // Integer
//		driver.test(1.5);//Double
//		driver.test(new Taxi());
		driver.test(new Bus()); // Bus타입의 객체가 Objact 로 형변환
		//driver.test(new Vehichle());// Bus타입의 객체가 아니기 때문에 강제형변환 불가
		
		System.out.println(bus instanceof Vehichle);
		System.out.println(bus instanceof Bus);
		System.out.println(bus instanceof Object);
		

	}

}
