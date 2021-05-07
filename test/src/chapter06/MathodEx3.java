package chapter06;

public class MathodEx3 {
	public static void main(String[] args) {
		Bus schoolBus = new Bus();
		System.out.println(schoolBus.speed);
		schoolBus.speedup();
		schoolBus.speedup();
		schoolBus.speedup();
		System.out.println(schoolBus.speed);
		
		Bus cityBus = new Bus();
		cityBus.speedup();
		cityBus.speedup();
		int speed = cityBus.getSpeed();
		cityBus.speedup();
		cityBus.speedup();
		cityBus.speedup();
		
		System.out.println("스쿨버스 :"+ schoolBus.speed + "시티버스 : "+ cityBus.speed);
		System.out.println("speed :"+speed);
		
		Bus zooBus = cityBus;
		zooBus.speeddown();
		System.out.println("스쿨버스 :"+ schoolBus.speed + "시티버스 : "+ cityBus.speed);
		
	}

}
