package chapter02;

public class VariableExample {

	public static void main(String[] args) {
	  int value = 10;
	  
	  int result = value +10 ;
	  
	  System.out.println(result);
	
	  // 변수의 사용 범위 (scope) -> 중괄호 블록 
	  if (true) {
		  // if문 블럭 안에서 선언되었기 때문에
		  // if문 블럭안에서만 사용가능
		  int a = 0 ;
		  int b=10;
	  }
	  // a = 1 ; // 사용불가
	}

}
