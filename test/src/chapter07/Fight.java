package chapter07;

public class Fight {
	
	public static void main(String[] args) {
		
	
	Knight knight = new Knight(200, 20);
	Magiction magiction = new Magiction(150, 30);
	
	knight.att(magiction);
	System.out.println(knight.hp+""+magiction.hp);
	
	magiction.skill(knight);
	System.out.println(knight.hp+""+magiction.hp);
	
	
		

}
}
