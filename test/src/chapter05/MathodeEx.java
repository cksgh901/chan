package chapter05;

public class MathodeEx {

	public static void main(String[] args) {
		int a =add(1232,9); // 메서드 호출 (실행)
		System.out.println(a);
		

	}
	// 메서드 정의
	// 리턴 타입 메서드명 (매개변수){
	//	... 실행문
	//	return 값
	//}
	//return 의 두가지 역할
	//-값을 돌려줌
	//- 메서드의 실행을 중지
	// 매개변수 2개(정수)를 입력받아 두 수의 합을 리턴하는 메서드
	public static int add(int x , int y) {
		return x+y;
	}
	
	// 매개변수가 없는 메서드
	//"홍길동을 리턴하는 메서드
	public static String name() {
		return "홍길동";
	}
	// 매개변수는 있고, 리턴이 없는 메서드
	// 이름을 입력받아 출력하는 메서드
	public static void print(String name) {
		System.out.println(name);
		
	}
	
	//매개변수도 없고 리턴도 없는 메서드
	//구구단을 출력하는 메서드
	public static void gugudan(int n){
		System.out.println(n + "단");
		for(int i = 0 ; i<=9; i++) {
			for(int j = 0; j<=9 ; j++) {
			System.out.println(i*j);
		}



}
}
}
	