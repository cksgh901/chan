package chapter07;

public class Fight2 {

	public static void main(String[] args) {
		Knight knight = new Knight(200, 20);
		Magiction magiction = new Magiction(150, 30);
		
		Cheartor owner;
		Cheartor target;
		
		while (true) {
			System.out.println(knight.hp+"   "+ magiction.hp);

			int n =(int)(Math.random()*2);
		if( n== 0) {
			owner = knight;
			target = magiction;
		}else {
			owner = magiction;
			target = knight;
		}
		owner.att(target);
		
		if (knight.hp == 0) {
			System.out.println("¸¶¹ý»ç ½Â¸®");
			break;
		}else if (magiction.hp == 0) {
			System.out.println("Àü»ç ½Â¸®");
			break;
			
		}
		
			
		

	}

}
}
