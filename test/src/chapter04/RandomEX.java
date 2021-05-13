package chapter04;

public class RandomEX {
public static void main(String[] args) {
		
		double number = Math.random(); // 0부터 1미만의 실수
		int number2 = (int)(number*6)+1;     // 강제형변환 (소수점 유실) 6을 곱하면 0~5까지
		
		System.out.println(number);
		System.out.println(number2);

		/*
		 * (Int)(Math.random()*갯수) * 시작값
		 */
	}

}



