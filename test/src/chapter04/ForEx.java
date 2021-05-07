package chapter04;

public class ForEx {

	public static void main(String[] args) {
		int sum = 0;
		//sum += 값이 변하네? ->변수
		//변수가 1~5까지 변하면서 반복
		
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		sum += 6;
		//for (초기값 ; 조건식 ; 증갑식)
		//변수 이름을 i
		int i = 0;
		for( i =1; i<=100; i++) {
			if(i%3==0) {
	
				sum += i;
			System.out.println(i);
        }
		//System.out.println(i);
		//System.out.println(sum);
			
	}
		
}
}
