package chapter06;

public class SingletonClass {
	
	String name;
	
	//��ü�� ���� �ʵ�(����) ����
	private static SingletonClass instance = new SingletonClass();
	
	private SingletonClass() {
		System.out.println("������");
		
	}
	public static SingletonClass getInstance () {
		if(instance == null) instance =  new SingletonClass();
	return instance;
	
}
}
