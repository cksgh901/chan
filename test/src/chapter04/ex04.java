package chapter04;

public class ex04 {

	public static void main(String[] args) {
		
	while (true) {
		int num =(int)(Math.random()*6)+1;
		int num2 =(int)(Math.random()*6)+1;
		int sum = num+num2;
		
		if (num + num2 == 5) {			
			break;
	    	}
		System.out.println( "(" +num+ "," +num2+")");
    	}
	}
}
