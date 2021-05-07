package chapter06;

public class SingletonEx {

	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getInstance();
		SingletonClass sc2 = SingletonClass.getInstance();
		
		sc.name = "È«±æµ¿";
		sc2.name = "±è±æµ¿";
		System.out.println(sc.name);

	}

}
