package chapter06;

public class SingletonEx {

	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getInstance();
		SingletonClass sc2 = SingletonClass.getInstance();
		
		sc.name = "ȫ�浿";
		sc2.name = "��浿";
		System.out.println(sc.name);

	}

}
