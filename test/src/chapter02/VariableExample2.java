package chapter02;

public class VariableExample2 {

	public static void main(String[] args) {
		
	  long a = 2000000000L;
	  double b = 3.14;
	  //int c = 3.14; // 정수타입의 변수에 실수값 대입 불가.
	  
	  
	  char c = 'A';
	  char d = 66;
	  System.out.println(c+1);
	  System.out.println(d);
	  
	  // 실수
	  float e = 3.14f;
	  double f = 3.141;
	 
	  boolean stop ; // boolean 타입에 stop 변수 선언
	  stop = true; // stop 변수에 true 대입 (초기화)
	  System.out.println(stop);
	  
	  if(stop) {
		 System.out.println("참");
			  }else {
				  System.out.println("거짓");
			  }
	  
	}
	
	

}
