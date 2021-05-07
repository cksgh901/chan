package chapter06;

public class Car1 {
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car1(){
		this("현대","무색",100);
		System.out.println("기본생성자");
	}
;	Car1(String model) {
		//this.model = model;
		this(model,"무색");
	}
	Car1(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model,color,100);
	}
	Car1(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("매개변수 3개 생성자");
		
	}

}
