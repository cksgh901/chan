package chapter08;

public class Zoo {

	public static void main(String[] args) {
//		Animal a = new Tiger();
//		a.eat();
//		a = new Lion();
//		a.eat();
		Animal[] ani = new Animal[4];
		ani[0] = new Tiger();
		ani[1] = new Lion();
		ani[2] = new Eagle();
		ani[3] = new Shark();
		
		for(int i=0 ; i<ani.length; i++) {
			ani[i].eat();
			
		}

	}

}
