package chapter06;

public class SingletonClass {
	
	String name;
	
	//객체를 담을 필드(변수) 선언
	private static SingletonClass instance = new SingletonClass();
	
	private SingletonClass() {
		System.out.println("생성자");
		
	}
	public static SingletonClass getInstance () {
		if(instance == null) instance =  new SingletonClass();
	return instance;
	
}
}
